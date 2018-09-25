package com.pipi.gof.responsibilitychain;

public abstract class AbstractHandler {

    protected Integer type;

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void doingByType(int type, String value) {
        if (this.type <= type) {
            doing(value);
        }

        if (nextHandler != null) {
            nextHandler.doingByType(type, value);
        }
    }

    abstract protected void doing(String value);

}
