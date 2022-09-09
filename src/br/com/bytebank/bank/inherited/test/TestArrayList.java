package br.com.bytebank.bank.inherited.test;

import java.util.ArrayList;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Cliente cliente = new Cliente("profissao", "nome", "cpf");
        Conta conta = new ContaCorrente(cliente, 123, 321);
        lista.add(conta);
        Conta contaP = new ContaPoupacanca(cliente, 456, 789);
        Conta contaP1 = new ContaPoupacanca(cliente, 4561, 7891);
        Conta contaP2 = new ContaPoupacanca(cliente, 4562, 7892);
        Conta contaP3 = new ContaPoupacanca(cliente, 4563, 7893);
        lista.add(contaP);
        System.out.println("Tamanho da lista " + lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println("Tamanho da lista " + lista.size());
        lista.add(contaP1);
        lista.add(contaP2);
        lista.add(contaP3);
        for (Object object : lista) {
            System.out.println(object);
            System.out.println("------------------------");
        }

    }

}