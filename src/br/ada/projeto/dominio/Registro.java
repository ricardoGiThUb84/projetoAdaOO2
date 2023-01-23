package br.ada.projeto.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record Registro(String tipoCliente, String tipoVeiculo, Integer quantidadeDias, double valor, LocalDate data) {

    public String exibeData() {

        return data.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
    }


    @Override
    public String toString() {
        return "Registro{" +
                "tipoCliente='" + tipoCliente + '\'' +
                ", tipoVeiculo='" + tipoVeiculo + '\'' +
                ", quantidadeDias=" + quantidadeDias +
                ", valor=" + valor +
                ", data=" + exibeData() +
                '}';
    }
}
