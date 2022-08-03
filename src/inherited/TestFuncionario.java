package inherited;

import inherited.models.Funcionario;
import inherited.models.Gerente;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Douglas Adams");
        funcionario.setCpf("42424242");
        funcionario.setSalario(42);

        System.out.println("Funcionario normal " + funcionario.getNome());
        System.out.println("Funcionario normal " + funcionario.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("gerenteNome");
        gerente.setSalario(4242.50);
        gerente.setCpf("123123");
        gerente.setSenha(123);
        System.out.println("Gerente " + gerente.autentica(123));
        System.out.println("Gerente " + gerente.getNome());
        System.out.println("Gerente " + gerente.getBonificacao());
    }
}
