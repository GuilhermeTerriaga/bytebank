package models;

public class Conta {
    private int agencia;
    private int numero;
    private Double saldo = 0.0;
    private String titular;

    public String getTitular() {
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

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita(Double valor) {
        this.saldo += valor;
    }

    public boolean saca(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;

    }

    public boolean transfere(Conta destino, Double valor) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;

    }
}