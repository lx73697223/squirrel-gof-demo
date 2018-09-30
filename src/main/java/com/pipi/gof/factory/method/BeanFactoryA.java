package com.pipi.gof.factory.method;

public class BeanFactoryA extends AbstractFactory {

    @Override
    public IBean getBean() {
        return new BeanA();
    }

}
