package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplA0 implements IAbstractionFactoryBeanA {

    @Override
    public void print() {
        System.out.println("==A0==" + this.getClass().getSimpleName());
    }

}
