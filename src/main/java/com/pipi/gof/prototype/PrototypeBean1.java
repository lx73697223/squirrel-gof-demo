package com.pipi.gof.prototype;

/**
 具体原型类
 */
public class PrototypeBean1 extends AbstractPrototypeBean {

    public PrototypeBean1() {
        super.type = "1";
    }

    @Override
    void print() {
        System.out.println(type);
    }

}
