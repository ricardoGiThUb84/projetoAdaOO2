package br.ada.projeto.dominio;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class RepositorioRegistro implements Repositorio {

    private static Repositorio instance = new RepositorioRegistro();

    private static int id = 1;

    private  Map<Integer, Registro> repositorioRegistro = new TreeMap<>();

    private RepositorioRegistro() {
    }

    public static Repositorio getInstance() {
        if (instance != null) return instance;

        return new RepositorioRegistro();
    }

    @Override
    public void salvar(String tipoCliente, String tipoVeiculo, Integer quantidadeDias, double valor) {

        Registro registro = new Registro(tipoCliente, tipoVeiculo, quantidadeDias, valor, LocalDate.now());

        repositorioRegistro.put(Integer.valueOf(id), registro);

        id++;

    }

    @Override
    public void mostrarRegistros() {

        System.out.println(repositorioRegistro);
    }
}
