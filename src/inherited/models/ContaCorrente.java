package inherited.models;

import inherited.models.interfaces.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {

    public ContaCorrente(Cliente titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public void saca(Double valor) {
        super.saca(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.15;
    }

}