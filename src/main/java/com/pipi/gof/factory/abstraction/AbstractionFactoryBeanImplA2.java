package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplA2 implements IAbstractionFactoryBeanA {

    @Override
    public void print() {
        System.out.println("==A2==" + this.getClass().getSimpleName());
    }

}
