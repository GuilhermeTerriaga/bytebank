package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.ContaCorrente;

public class TestArraysReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contaCorrentes = new ContaCorrente[5];
        Cliente cliente = new Cliente();
        for (int i = 0; i < contaCorrentes.length; i++) {
            ContaCorrente cc = new ContaCorrente(cliente, i, i);
            contaCorrentes[i] = cc;
            contaCorrentes[i].deposita(32.00);
            System.out.println(contaCorrentes[i].getSaldo());
            System.out.println(contaCorrentes[i]);
        }
    }
}
