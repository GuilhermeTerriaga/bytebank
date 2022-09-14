package br.com.bytebank.bank.inherited.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;

public class TestLambda {
    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();
        Conta cc1 = new ContaCorrente(66, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupacanca(55, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupacanca(33, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
        Comparator<Conta> comp = (c1, c2) -> {
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        };
        lista.forEach((conta) -> System.out
                .println(conta + " nome " + conta.getTitular().getNome() + " saldo " + conta.getSaldo() + "\n"));
    }
}
