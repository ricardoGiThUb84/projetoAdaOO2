package br.ada.projeto.classesAuxiliares;

import br.ada.projeto.dominio.Cliente;

public class ClienteFactory {

    public static Cliente criarCliente(String tipoCliente) {

        Cliente cliente = null;

        for (TipoCliente tipo : TipoCliente.values()) {

            if (tipo.getTipo().equalsIgnoreCase(tipoCliente)) return tipo.getCliente();

        }

        return cliente;
    }
}
