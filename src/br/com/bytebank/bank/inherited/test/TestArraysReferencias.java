package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;
import br.com.bytebank.bank.inherited.models.ContaPoupacanca;

public class TestArraysReferencias {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];
        Cliente cliente = new Cliente();
        for (int i = 0; i < referencias.length; i++) {
            if (i % 2 == 0) {
                ContaCorrente cc = new ContaCorrente(cliente, i, i);
                referencias[i] = cc;
            } else {
                ContaPoupacanca cp = new ContaPoupacanca(cliente, i, i);
                referencias[i] = cp;
            }
            ((Conta) referencias[i]).deposita(32.00);
            System.out.println(((Conta) referencias[i]).getSaldo());
            System.out.println(referencias[i]);
        }
        ContaCorrente ref = (ContaCorrente) referencias[2];
        System.out.println(ref.getAgencia());
    }
}
