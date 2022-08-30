package br.com.bytebank.bank.inherited.test;

import br.com.bytebank.bank.inherited.util.Exceptions.MyOwnException;

public class TestFluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws MyOwnException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyOwnException {
        System.out.println("Ini do metodo2");

        throw new MyOwnException("problema!");

        // System.out.println("Fim do metodo2");
    }
}