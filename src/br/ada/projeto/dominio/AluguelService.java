package br.ada.projeto.dominio;

public class AluguelService {


    private Repositorio repositorio;

    private Aluguel aluguel;


    public AluguelService(Aluguel aluguel, Repositorio repositorio) {
        this.aluguel = aluguel;
        this.repositorio = repositorio;
    }

    public double valorAluguel(int diarias, String tipoveiculo) {

        return aluguel.valorAluguel(diarias, tipoveiculo);
    }

    public void salvar(String tipoCliente, String tipoVeiculo, Integer quantidadeDias, double valor) {

        repositorio.salvar(tipoCliente, tipoVeiculo, quantidadeDias, valor);

    }

    public void mostrarRegistros() {

        repositorio.mostrarRegistros();
    }
}
