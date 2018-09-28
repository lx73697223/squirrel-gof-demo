package com.pipi.gof.decorator;

public class Client {

    public static void main(String[] args) {

        Component component = new ComponentImpl1();

        Decorator decorator = new DecoratorImpl1(component);

        decorator.doing();
    }
}
