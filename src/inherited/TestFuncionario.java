package inherited;

import inherited.models.Designer;
import inherited.models.Funcionario;
import inherited.models.Gerente;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Designer();
        funcionario.setNome("Douglas Adams");
        funcionario.setCpf("42424242");
        funcionario.setSalario(42);

        System.out.println("Designer normal " + funcionario.getNome());
        System.out.println("Designer normal " + funcionario.getBonificacao());

        Funcionario gerente = new Gerente();
        gerente.setNome("gerenteNome");
        gerente.setSalario(4242.50);
        gerente.setCpf("123123");
        ((Gerente) gerente).setSenha(123);
        System.out.println("Gerente " + ((Gerente) gerente).autentica(123));
        System.out.println("Gerente " + gerente.getNome());
        System.out.println("Gerente " + gerente.getBonificacao());
    }
}
