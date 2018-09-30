package com.pipi.gof.factory.abstraction;

/**
 定义一个被相应具体工厂创建的产品对象
 实现AbstractProduct接口
 */
public class BeanImplA0 implements IBeanA {

    @Override
    public void print() {
        System.out.println("==A0==");
    }

}
