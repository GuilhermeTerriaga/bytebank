package inherited;

import inherited.models.Cliente;
import inherited.models.Conta;
import inherited.models.ContaCorrente;
import inherited.models.ContaPoupacanca;

public class TestConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("profissao", "nome", "123436");
        Conta conta = new ContaCorrente(cliente, 123, 2);
        conta.deposita(12.00);
        System.out.println(conta.getSaldo());
        ContaPoupacanca contaPoupacanca = new ContaPoupacanca(cliente, 334, 21);
        conta.transfere(contaPoupacanca, 6.0);
        System.out.println("Conta Corrente " + conta.getSaldo());
        System.out.println("Conta Poupanca " + contaPoupacanca.getSaldo());
    }
}
