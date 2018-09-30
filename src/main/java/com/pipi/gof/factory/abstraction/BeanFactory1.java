package com.pipi.gof.factory.abstraction;

/**
 实现创建具体产品对象的操作 */
public class BeanFactory1 extends AbstractFactory {

    @Override
    public IBeanA getBeanA() {
        return new BeanImplA1();
    }

    @Override
    public IBeanB getBeanB() {
        return new BeanImplB1();
    }

}
