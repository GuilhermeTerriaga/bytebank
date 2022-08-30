package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.control.SistemaInterno;
import br.com.bytebank.bank.inherited.models.Administrador;
import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Gerente;
import br.com.bytebank.bank.inherited.models.interfaces.IAutenticavel;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        IAutenticavel gerente = new Gerente();
        gerente.setSenha(222);

        IAutenticavel administrador = new Administrador();
        administrador.setSenha(2922);

        IAutenticavel cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }

}
