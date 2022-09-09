package br.com.bytebank.bank.inherited.test;

import java.util.ArrayList;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;

public class TestArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Cliente cliente = new Cliente("profissao", "nome", "cpf");
        Conta contaP = new ContaPoupacanca(cliente, 456, 789);
        Conta contaP1 = new ContaPoupacanca(cliente, 4561, 7891);
        Conta contaP2 = new ContaPoupacanca(cliente, 4561, 7891);
        lista.add(contaP1);
        lista.add(contaP2);
        lista.add(contaP);

        System.out.println("Já contém contaP? " + lista.contains(contaP));
        for (Conta conta : lista) {
            System.out.println("-----------------------");
            System.out.println(conta);
        }
    }

}