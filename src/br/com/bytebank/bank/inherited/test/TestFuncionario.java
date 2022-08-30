package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.models.Designer;
import br.com.bytebank.bank.inherited.models.Funcionario;
import br.com.bytebank.bank.inherited.models.Gerente;
import br.com.bytebank.bank.inherited.models.interfaces.IAutenticavel;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Designer();
        funcionario.setNome("Douglas Adams");
        funcionario.setCpf("42424242");
        funcionario.setSalario(42);

        System.out.println("Designer normal " + funcionario.getNome());
        System.out.println("Designer normal " + funcionario.getBonificacao());

        Funcionario gerente = new Gerente();
        IAutenticavel gerenteAutenticavel = (IAutenticavel) gerente;
        gerente.setNome("gerenteNome");
        gerente.setSalario(4242.50);
        gerente.setCpf("123123");
        gerenteAutenticavel.setSenha(123);
        System.out.println("Gerente " + gerenteAutenticavel.autentica(123));
        System.out.println("Gerente " + gerente.getNome());
        System.out.println("Gerente " + gerente.getBonificacao());
    }
}
