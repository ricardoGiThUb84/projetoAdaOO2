package br.ada.projeto.util;

public class CincoPorcento implements IDesconto {

    @Override
    public double calcula(double valor, int quantidadeDiarias) {
        return (quantidadeDiarias > 5) ? valor * 0.95 : valor * 1;
    }
}
