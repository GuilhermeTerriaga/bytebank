package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.util.Exceptions.SaldoInsuficienteEx;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Double saldo = 0.0;
    private Cliente titular;
    private static int total = 0;

    public Cliente getTitular() {

        return this.titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public static int getTotal() {
        return total;
    }

    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposita(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saca(Double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteEx(
                    "Saldo insuficente para saque!\nSaldo:" + this.saldo + "\nValor a sacar: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(Conta destino, Double valor) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public Conta(Cliente titular, int numero, int agencia) {
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setTitular(titular);
    }

}