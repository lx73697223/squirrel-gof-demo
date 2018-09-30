package com.pipi.gof.factory.abstraction;

public class BeanFactory2 extends AbstractFactory {

    @Override
    public IBeanA getBeanA() {
        return new BeanImplA2();
    }

    @Override
    public IBeanB getBeanB() {
        return new BeanImplB2();
    }

}
