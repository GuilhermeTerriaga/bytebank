package inherited.models;

import inherited.models.interfaces.ITributavel;

public class Seguro implements ITributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
