package br.ada.projeto.dominio;

import br.ada.projeto.util.IDesconto;

public abstract class Cliente {


    protected IDesconto desconto;

    public abstract IDesconto getDesconto();


}
