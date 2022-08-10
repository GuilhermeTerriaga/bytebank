package inherited.control;

import inherited.models.interfaces.ITributavel;

public class CalculadorImposto {
    private double imposto;

    public void calculaImposto(ITributavel tributavel) {
        imposto += tributavel.getValorImposto();
    }

    public double getImposto() {
        return imposto;
    }
}