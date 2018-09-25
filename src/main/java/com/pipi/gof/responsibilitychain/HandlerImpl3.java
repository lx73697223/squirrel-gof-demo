package com.pipi.gof.responsibilitychain;

public class HandlerImpl3 extends AbstractHandler {

    public HandlerImpl3(Integer type) {
        super.type = type;
    }

    @Override
    protected void doing(String value) {
        System.out.println(String.format("handler2, type %s, execute %s", type, value));
    }

}
