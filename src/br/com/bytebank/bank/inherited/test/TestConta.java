package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;

public class TestConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("profissao", "nome", "123436");
        Conta conta = new ContaCorrente(cliente, 123, 2);
        conta.deposita(12.00);
        System.out.println(conta.getSaldo());
        ContaPoupacanca contaPoupacanca = new ContaPoupacanca(cliente, 334, 21);
        conta.transfere(contaPoupacanca, 6.0);
        System.out.println("Conta Corrente " + conta.getSaldo());
        System.out.println("Conta Poupanca " + contaPoupacanca.getSaldo());
    }
}
