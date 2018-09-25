package com.pipi.gof.responsibilitychain;

public class HandlerImpl1 extends AbstractHandler {

    public HandlerImpl1(Integer type) {
        super.type = type;
    }

    @Override
    protected void doing(String value) {
        System.out.println(String.format("handler1, type %s, doing %s", type, value));
    }

}
