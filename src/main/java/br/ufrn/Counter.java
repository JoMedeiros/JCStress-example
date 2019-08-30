package br.ufrn;

public class Counter {
    //private static int i;
    private int i = 0;
    public synchronized int getNext(){
        return i++;
    }
}
