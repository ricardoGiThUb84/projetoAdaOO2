package br.ada.projeto.dominio;

public enum Veiculo {

    PEQUENO(1,"pequeno", 100),
    MEDIO(2,"medio", 150),
    SUV(3,"SUV", 200);

    private int indice;
    private String tipoVeiculo;
    private double valorDiaria;

    Veiculo(int indice ,String tipoVeiculo, double valorDiaria) {
        this.indice = indice;
        this.tipoVeiculo = tipoVeiculo;
        this.valorDiaria = valorDiaria;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public int getIndice() {
        return indice;
    }

    public double valDiaria(String tipoVeiculo) {

        for (Veiculo tipo : Veiculo.values()) {

            if (tipo.getTipoVeiculo().equalsIgnoreCase(tipoVeiculo)) return tipo.getValorDiaria();
        }

        return 0;
    }
}
