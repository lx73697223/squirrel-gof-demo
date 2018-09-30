package com.pipi.gof.factory.abstraction;

public class BeanImplB1 implements IBeanB {

    @Override
    public void console(IBeanA beanA) {
        System.out.print("==B1==>");
        beanA.print();
    }

}
