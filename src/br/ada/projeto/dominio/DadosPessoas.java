package br.ada.projeto.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DadosPessoas {

    private String nome;
    private LocalDate datanascimento;

    private String idade;

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setDatanascimento(String datanascimento) {
        this.datanascimento = LocalDate.parse(datanascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getDatanascimento() {
        return datanascimento.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
    }

    public String getIdade() {

        return String.valueOf(ChronoUnit.YEARS.between(this.datanascimento, LocalDate.now()));
    }
}
