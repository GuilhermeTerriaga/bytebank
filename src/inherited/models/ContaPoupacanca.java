package inherited.models;

public class ContaPoupacanca extends Conta {
    public ContaPoupacanca(Cliente titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }
}
