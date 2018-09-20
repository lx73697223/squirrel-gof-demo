package com.pipi.gof.singleton;

public class EagerSingleton {

    private final static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("init.");
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
