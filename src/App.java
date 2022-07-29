import models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Conta segundaConta = new Conta();
        Double valor = Double.valueOf(123);
        conta.deposita(valor);
        System.out.println(conta.getSaldo());
        System.out.println(segundaConta.getSaldo());
        System.out.println(segundaConta.getTitular());
        if (conta.equals(segundaConta)) {
            System.out.println("igual!");
        } else {
            System.out.println("não igual");
        }
    }
}
