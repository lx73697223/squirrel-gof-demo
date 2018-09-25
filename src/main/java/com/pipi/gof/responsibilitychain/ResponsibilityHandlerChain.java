package com.pipi.gof.responsibilitychain;

public class ResponsibilityHandlerChain {

    public AbstractHandler getHandlerChain() {

        AbstractHandler handler1 = new HandlerImpl1(1);
        AbstractHandler handler2 = new HandlerImpl2(2);
        AbstractHandler handler3 = new HandlerImpl3(3);

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        return handler3;
    }

}
