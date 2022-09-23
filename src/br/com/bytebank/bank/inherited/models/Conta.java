package br.com.bytebank.bank.inherited.models;

import java.io.Serializable;

import br.com.bytebank.bank.inherited.util.Exceptions.SaldoInsuficienteEx;

/**
 * Teste de javadoc para conta
 * 
 * @author Guilherme Terriaga
 * @version 1.0
 * 
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
    private int agencia;
    private int numero;
    private Double saldo = 0.0;
    private transient Cliente titular;
    private static int total = 0;

    /**
     * @return Cliente
     */
    public Cliente getTitular() {

        return this.titular;
    }

    /**
     * @return int
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @return int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return Double
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @return int
     */
    public static int getTotal() {
        return total;
    }

    /**
     * @param agencia
     */
    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @param numero
     */
    private void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @param titular
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    /**
     * @param valor
     */
    public void deposita(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    /**
     * @param valor
     */
    public void saca(Double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteEx(
                    "Saldo insuficente para saque!\nSaldo:" + this.saldo + "\nValor a sacar: " + valor);
        }
        this.saldo -= valor;
    }

    /**
     * @param destino
     * @param valor
     */
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

    public Conta(int numero, int agencia) {
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

    @Override
    public boolean equals(Object obj) {
        Conta outra = (Conta) obj;

        if (this.agencia != outra.getAgencia()) {
            return false;
        }

        if (this.numero != outra.getNumero()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Numero " + this.getNumero() + "\nAgencia " + this.getAgencia();
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }

}