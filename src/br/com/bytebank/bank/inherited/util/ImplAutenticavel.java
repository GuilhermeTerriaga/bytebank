package br.com.bytebank.bank.inherited.util;

public class ImplAutenticavel {
    private int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
