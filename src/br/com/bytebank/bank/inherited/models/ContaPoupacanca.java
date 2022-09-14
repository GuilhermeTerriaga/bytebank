package br.com.bytebank.bank.inherited.models;

public class ContaPoupacanca extends Conta {
    public ContaPoupacanca(Cliente titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public ContaPoupacanca(int numero, int agencia) {
        super(numero, agencia);
    }
}
