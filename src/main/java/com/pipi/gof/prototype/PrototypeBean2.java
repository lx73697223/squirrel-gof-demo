package com.pipi.gof.prototype;

public class PrototypeBean2 extends AbstractPrototypeBean {

    public PrototypeBean2() {
        super.type = "2";
    }

    @Override
    void print() {
        System.out.println(type);
    }

}
