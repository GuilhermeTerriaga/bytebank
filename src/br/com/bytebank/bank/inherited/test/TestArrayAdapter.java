package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;
import br.com.bytebank.bank.inherited.util.Guardador;

public class TestArrayAdapter {
    public static void main(String[] args) {
        Guardador guardador = new Guardador();
        Cliente cliente = new Cliente("profissao", "nome", "cpf");
        Conta conta = new ContaPoupacanca(cliente, 123, 142);
        guardador.guarda(conta);
        guardador.guarda(conta);
        guardador.guarda(conta);
        System.out.println(guardador.getQuantidadeElementos());
        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
        guardador.guarda(cliente);
        Cliente refCli = (Cliente) guardador.getReferencia(3);
        System.out.println(refCli.getNome());
        System.out.println(guardador.getQuantidadeElementos());

    }
}
