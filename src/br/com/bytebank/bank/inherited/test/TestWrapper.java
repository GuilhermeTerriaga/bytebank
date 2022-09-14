package br.com.bytebank.bank.inherited.test;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {
    public static void main(String[] args) {
        int[] nArray = new int[5];
        int n = 29;
        Integer nObj = Integer.valueOf(n);
        List<Integer> nRef = new ArrayList<Integer>();
        nRef.add(nObj);
        nRef.add(n); // autoboxing
        int i = nObj.intValue(); // unboxing

        String s = args[0];
        Integer number = Integer.valueOf(s);
        System.out.println(number);
        System.out.println(nObj.floatValue());
        System.out.println("Max val " + Integer.MAX_VALUE);
        System.out.println("Min val" + Integer.MIN_VALUE);
        System.out.println("Bits " + Integer.SIZE);
        System.out.println("Bytes " + Integer.BYTES);
        nObj++;
        System.out.println(nObj);
        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef);

    }

}
