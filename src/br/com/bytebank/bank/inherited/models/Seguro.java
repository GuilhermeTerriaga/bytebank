package br.com.bytebank.bank.inherited.models;

import br.com.bytebank.bank.inherited.models.interfaces.ITributavel;

public class Seguro implements ITributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
