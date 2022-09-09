package br.com.bytebank.bank.inherited.util;

public class Guardador {
    private int freePosition;
    private Object[] ref;

    public Guardador() {
        ref = new Object[10];
        freePosition = 0;
    }

    public void guarda(Object object) {
        ref[freePosition] = object;
        freePosition++;
    }

    public int getQuantidadeElementos() {
        return freePosition;
    }

    public Object getReferencia(int i) {
        return ref[i];
    }

}
