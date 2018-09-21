package com.pipi.gof.prototype;

public class PrototypeBean3 extends AbstractPrototypeBean {

    public PrototypeBean3() {
        super.type = "3";
    }

    @Override
    void print() {
        System.out.println(type);
    }

}
