package br.com.bytebank.bank.encapsulated.models;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    /**
     * @return String
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return String
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @return String
     */
    public String getNome() {
        return nome;
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
     * @param profissao
     */
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
