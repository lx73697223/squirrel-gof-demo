package com.pipi.gof.singleton;

public enum EnumSingleton {

    INSTANCE;

    EnumSingleton(){
        System.out.println("init.");
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
