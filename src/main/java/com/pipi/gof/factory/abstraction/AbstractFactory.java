package com.pipi.gof.factory.abstraction;

/**
 声明一个创建抽象产品对象的操作接口 */
public abstract class AbstractFactory {

    public abstract IBeanA getBeanA();

    public abstract IBeanB getBeanB();

}
