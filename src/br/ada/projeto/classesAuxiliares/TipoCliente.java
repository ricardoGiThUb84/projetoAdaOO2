package br.ada.projeto.classesAuxiliares;

import br.ada.projeto.dominio.Cliente;
import br.ada.projeto.dominio.ClienteFisico;
import br.ada.projeto.dominio.ClienteJuridico;

public enum TipoCliente {

    CLIENTE_FISICO("fisico" , new ClienteFisico()),
    CLIENTE_JURIDICO("juridico" , new ClienteJuridico());

    private String tipo;
    private Cliente cliente;

    TipoCliente(String tipo, Cliente cliente) {
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
