package inherited.control;

import inherited.models.IBonificavel;

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
