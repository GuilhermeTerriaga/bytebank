package inherited;

import inherited.control.CalculadorImposto;
import inherited.models.Cliente;
import inherited.models.ContaCorrente;
import inherited.models.Seguro;

public class TestTributavel {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("nome do cliente");
        ContaCorrente contaCorrente = new ContaCorrente(cliente, 123, 4242);
        contaCorrente.deposita(1500.00);
        Seguro seguro = new Seguro();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.calculaImposto(contaCorrente);
        calculadorImposto.calculaImposto(seguro);
        System.out.println("total de imposto! " + calculadorImposto.getImposto());

    }
}
