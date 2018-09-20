package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplB0 implements IAbstractionFactoryBeanB {

    @Override
    public void console() {
        System.out.println("==B0==" + this.getClass().getSimpleName());
    }

}
