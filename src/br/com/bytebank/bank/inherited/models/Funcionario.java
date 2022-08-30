package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.models.interfaces.IBonificavel;

public abstract class Funcionario implements IBonificavel {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
