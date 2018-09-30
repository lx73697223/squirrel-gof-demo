package com.pipi.gof.factory.abstraction;

public class BeanImplB2 implements IBeanB {

    @Override
    public void console(IBeanA beanA) {
        System.out.print("==B2==>");
        beanA.print();
    }

}
