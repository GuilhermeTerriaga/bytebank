package br.com.bytebank.bank.inherited.models;

import java.io.Serializable;

import br.com.bytebank.bank.inherited.models.interfaces.IAutenticavel;
import br.com.bytebank.bank.inherited.util.ImplAutenticavel;

/**
 * Teste de javadoc
 * 
 * @author Guilherme Terriaga
 * @version 1.0
 * 
 */
public class Cliente implements IAutenticavel, Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String cpf;
    private String profissao;
    private transient ImplAutenticavel autenticacao;

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
        this.autenticacao = new ImplAutenticavel();

    }

    public Cliente() {
        this.autenticacao = new ImplAutenticavel();
    }

    @Override
    public boolean autentica(int senha) {
        return autenticacao.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacao.setSenha(senha);
    }

}
