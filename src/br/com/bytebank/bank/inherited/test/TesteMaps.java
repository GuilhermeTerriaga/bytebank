package br.com.bytebank.bank.inherited.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TesteMaps {
    public static void main(String[] args) {
        HashMap<Long, List<String>> bars = new HashMap<>();
        List<String> list = new ArrayList<>();
        // list.add("item 1 da lista");
        bars.put(1L, list);
        if (bars.isEmpty()) {
            System.out.println("vazio");
        }
        if (bars.get(bars.keySet().iterator().next()).isEmpty()) { // Valida se o primeiro item da lista existe
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
        var teste = bars.get(bars.keySet().iterator().next()).get(bars.size() - 1);
        System.out.println(teste);

    }
}
