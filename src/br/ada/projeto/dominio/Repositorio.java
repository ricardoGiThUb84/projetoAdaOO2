package br.ada.projeto.dominio;

public interface Repositorio {

    public void salvar(String tipoCliente, String tipoVeiculo, Integer quantidadeDias, double valor);

    public void mostrarRegistros();
}
