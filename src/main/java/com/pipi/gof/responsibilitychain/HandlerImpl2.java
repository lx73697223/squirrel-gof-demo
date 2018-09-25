package com.pipi.gof.responsibilitychain;

public class HandlerImpl2 extends AbstractHandler {

    public HandlerImpl2(Integer type) {
        super.type = type;
    }

    @Override
    protected void doing(String value) {
        System.out.println(String.format("handler2, type %s, execute %s", type, value));
    }

}
