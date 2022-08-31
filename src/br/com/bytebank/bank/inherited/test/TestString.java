package br.com.bytebank.bank.inherited.test;

public class TestString {
    public static void main(String[] args) {
        String teste = "guilherme"; // object literal
        // String teste2= new String("asdf"); má prática
        char arr[] = teste.toCharArray();
        int numChar = teste.length() - 1;
        for (int i = 0; i < numChar / 2; i++) {
            char temporary = arr[i];
            arr[i] = arr[numChar - i];
            arr[numChar - i] = temporary;
        }
        String result = new String(arr);
        System.out.println("original " + teste);
        System.out.println("inverted " + result);
    }
}
