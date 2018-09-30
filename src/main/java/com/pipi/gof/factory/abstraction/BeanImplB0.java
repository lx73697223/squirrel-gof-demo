package com.pipi.gof.factory.abstraction;

public class BeanImplB0 implements IBeanB {

    @Override
    public void console(IBeanA beanA) {
        System.out.print("==B0==>");
        beanA.print();
    }

}
