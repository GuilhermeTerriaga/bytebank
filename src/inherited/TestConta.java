package inherited;

import inherited.models.Cliente;
import inherited.models.Conta;
import inherited.models.ContaCorrente;

public class TestConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("profissao", "nome", "123436");
        Conta conta = new ContaCorrente(cliente, 123, 2);
        conta.deposita(12.00);
        System.out.println(conta.getSaldo());
    }
}
