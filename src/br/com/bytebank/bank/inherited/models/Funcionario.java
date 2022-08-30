package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.models.interfaces.IBonificavel;

public abstract class Funcionario implements IBonificavel {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {

    }

    /**
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return String
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return double
     */
    public double getSalario() {
        return salario;
    }
}
