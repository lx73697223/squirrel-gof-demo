package com.pipi.gof.bridge;

public class ServiceAImpl2 implements IServiceA {

    @Override
    public void doA(String name, String value) {
        System.out.println(String.format("ServiceAImpl2 doA. name is %s, value is %s", name, value));
    }

}
