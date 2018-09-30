package com.pipi.gof.factory.abstraction;

public class Producer {

    private IBeanA beanA;

    private IBeanB beanB;

    public Producer(AbstractFactory factory) {
        this.beanA = factory.getBeanA();
        this.beanB = factory.getBeanB();
    }

    public void doing() {
        beanB.console(beanA);
    }

}
