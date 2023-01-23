package br.ada.projeto.dominio;

import br.ada.projeto.util.CincoPorcento;
import br.ada.projeto.util.IDesconto;

public class ClienteFisico extends Cliente {

    public ClienteFisico() {
        this.desconto = new CincoPorcento();

    }

    @Override
    public IDesconto getDesconto() {
        return this.desconto;
    }

}
