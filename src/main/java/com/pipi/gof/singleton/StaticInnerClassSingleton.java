package com.pipi.gof.singleton;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        System.out.println("init...");
    }

    private static class StaticInnerClassSingletonInstance {

        private final static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance() {
        System.out.println("doing...");
        return StaticInnerClassSingletonInstance.INSTANCE;
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
    }

}
