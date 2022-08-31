package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.ContaCorrente;

public class TesteClass {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente(cliente, 123, 456);
        System.out.println(cc);
    }
}