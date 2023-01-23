package br.ada.projeto.dominio;

public class Aluguel {

    private Cliente cliente;

    public Aluguel(Cliente cliente) {
        this.cliente = cliente;

    }

    public double valorAluguel(int diarias, String tipoVeiculo) {

        final double valor = geraValorDiariaPorTipoVeiculo(tipoVeiculo) * diarias;

        return cliente.getDesconto().calcula(valor, diarias);

    }

    private double geraValorDiariaPorTipoVeiculo(String tipoVeiculo) {

        double valorDiaria = 1;
        for (Veiculo veic : Veiculo.values()) {
            if (veic.getTipoVeiculo().equalsIgnoreCase(tipoVeiculo)) {
                valorDiaria = veic.getValorDiaria();
                break;
            }
        }
        return valorDiaria;
    }
}
