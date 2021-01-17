package oop.patterns;


public class Counter {
    private int counter;

    private static Counter instance = new Counter();

    private Counter(){

    }

    public static Counter getInstance(){
        return instance;
    }


    public int incrementCounter(){
        return ++counter;
    }
}
