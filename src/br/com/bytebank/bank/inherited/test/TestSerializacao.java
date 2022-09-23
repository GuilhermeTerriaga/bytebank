package br.com.bytebank.bank.inherited.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.bank.inherited.models.Cliente;
import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;

public class TestSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("nome");
        cliente.setCpf("cpf");
        cliente.setProfissao("profissao");

        Conta cc = new ContaCorrente(cliente, 123, 456);
        cc.deposita(42.0);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        objectOutputStream.writeObject(cc);
        objectOutputStream.close();
    }
}
