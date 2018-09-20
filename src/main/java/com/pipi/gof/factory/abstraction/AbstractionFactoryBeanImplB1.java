package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplB1 implements IAbstractionFactoryBeanB {

    @Override
    public void console() {
        System.out.println("==B1==" + this.getClass().getSimpleName());
    }

}
