package com.pipi.gof.bridge;

public class ServiceAImpl1 implements IServiceA {

    @Override
    public void doA(String name, String value) {
        System.out.println(String.format("ServiceAImpl1 doA. name is %s, value is %s", name, value));
    }

}
