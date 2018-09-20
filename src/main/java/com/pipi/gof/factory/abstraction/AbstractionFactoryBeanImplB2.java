package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryBeanImplB2 implements IAbstractionFactoryBeanB {

    @Override
    public void console() {
        System.out.println("==B2==" + this.getClass().getSimpleName());
    }

}
