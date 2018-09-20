package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplA1 implements IAbstractionFactoryBeanA {

    @Override
    public void print() {
        System.out.println("==A1==" + this.getClass().getSimpleName());
    }

}
