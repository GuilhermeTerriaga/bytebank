package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.util.Exceptions.SaldoInsuficienteEx;

/**
 * Teste de javadoc para conta
 * 
 * @author Guilherme Terriaga
 * @version 1.0
 * 
 */

public abstract class Conta {
    private int agencia;
    private int numero;
    private Double saldo = 0.0;
    private Cliente titular;
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

    @Override
    public String toString() {
        return "Numero " + this.getNumero() + "\nAgencia " + this.getAgencia();
    }

}