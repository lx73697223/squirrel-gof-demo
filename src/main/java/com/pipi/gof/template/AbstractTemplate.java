package com.pipi.gof.template;

public abstract class AbstractTemplate {

    protected abstract void do1();

    protected abstract void do2();

    protected abstract void do3();

    public final void doing() {
        do1();
        do2();
        do3();
    }

}
