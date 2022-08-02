

import models.Conta;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(50.00);
        boolean sucessoSaca = conta.saca(20.00);
        if (sucessoSaca) {
            System.out.println("sucesso!");
        }
        System.out.println(conta.getSaldo());
        Conta conta2 = new Conta();
        conta2.deposita(100.00);
        System.out.println(conta2.getSaldo());
        conta2.transfere(conta, 50.00);
        System.out.println(conta2.getSaldo());

    }
}
