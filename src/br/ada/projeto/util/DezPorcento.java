package br.ada.projeto.util;

public class DezPorcento implements IDesconto{

    @Override
    public double calcula(double valor, int quantidadeDiarias) {
        return (quantidadeDiarias > 3) ? valor * 0.9 : valor * 1 ;
    }
}
