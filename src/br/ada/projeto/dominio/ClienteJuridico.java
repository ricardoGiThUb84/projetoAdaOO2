package br.ada.projeto.dominio;

import br.ada.projeto.util.DezPorcento;
import br.ada.projeto.util.IDesconto;

public class ClienteJuridico extends Cliente {

    public ClienteJuridico() {
        this.desconto = new DezPorcento();

    }

    @Override
    public IDesconto getDesconto() {
        return this.desconto;
    }


}


