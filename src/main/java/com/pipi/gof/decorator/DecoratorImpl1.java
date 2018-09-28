package com.pipi.gof.decorator;

/**
 负责向ConcreteComponent添加功能
 */
public class DecoratorImpl1 extends Decorator {

    public DecoratorImpl1(Component component) {
        super(component);
    }

    @Override
    public void doing() {
        System.out.println("DecoratorImpl1 doing start...");

        super.doing();

        System.out.println("DecoratorImpl1 doing end.");
    }

}
