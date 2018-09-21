package com.pipi.gof.prototype;

public class PrototypeBean1 extends AbstractPrototypeBean {

    public PrototypeBean1() {
        super.type = "1";
    }

    @Override
    void print() {
        System.out.println(type);
    }

}
