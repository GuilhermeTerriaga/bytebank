package encapsulated;

import encapsulated.models.Cliente;
import encapsulated.models.Conta;

public class TesteComposicao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("TesteProfissao", "TesteNome", "TesteCPF");
        Conta contaTeste = new Conta(cliente, 123, 456);
        contaTeste.deposita(4200.00);
        System.out.println("Titular da conta " + contaTeste.getTitular().getNome());
        System.out.println("Saldo da conta" + contaTeste.getSaldo());
        System.out.println(Conta.getTotal());
    }
}
