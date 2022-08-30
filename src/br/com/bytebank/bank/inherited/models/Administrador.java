package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.models.interfaces.IAutenticavel;
import br.com.bytebank.bank.inherited.util.ImplAutenticavel;

public class Administrador extends Funcionario implements IAutenticavel {
    private ImplAutenticavel autenticacao;

    @Override
    public double getBonificacao() {
        return 50;
    }

    public Administrador() {
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
