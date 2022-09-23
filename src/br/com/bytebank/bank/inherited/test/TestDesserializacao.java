package br.com.bytebank.bank.inherited.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.bank.inherited.models.Conta;
import br.com.bytebank.bank.inherited.models.ContaCorrente;

public class TestDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cc.bin"));
        Conta obj = (ContaCorrente) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(obj.getSaldo());
        System.out.println(obj.getTitular().getNome());
    }
}
