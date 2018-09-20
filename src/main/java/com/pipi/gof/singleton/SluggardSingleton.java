package com.pipi.gof.singleton;

public class SluggardSingleton {

    private volatile static SluggardSingleton INSTANCE = null;

    private SluggardSingleton(){
        System.out.println("init.");
    }

    public static SluggardSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (SluggardSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new SluggardSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
