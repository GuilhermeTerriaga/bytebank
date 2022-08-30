package br.com.bytebank.bank.inherited.control;

import br.com.bytebank.bank.inherited.models.interfaces.IBonificavel;

public class ControleBonificacao {

    private double soma;

    public void registra(IBonificavel bonificavel) {
        double bonificacao = bonificavel.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
