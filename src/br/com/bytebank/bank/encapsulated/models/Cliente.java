package br.com.bytebank.bank.encapsulated.models;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(String profissao, String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
    }

    public Cliente() {

    }
}
