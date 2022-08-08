package inherited.models;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public boolean saca(Double valor) {
        return super.saca(valor + 0.2);
    }

}