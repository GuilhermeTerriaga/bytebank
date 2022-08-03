package encapsulated;

import encapsulated.models.Conta;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(42.00);
        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.getSaldo());
    }
}
