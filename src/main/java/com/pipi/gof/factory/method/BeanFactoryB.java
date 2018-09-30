package com.pipi.gof.factory.method;

public class BeanFactoryB extends AbstractFactory {

    @Override
    public IBean getBean() {
        return new BeanB();
    }

}
