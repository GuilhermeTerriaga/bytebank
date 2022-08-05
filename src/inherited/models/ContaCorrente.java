package inherited.models;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

}