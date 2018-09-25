package com.pipi.gof.proxy;

public class BeanRealImpl implements IBean {

    private String value;

    public BeanRealImpl(String value) {
        this.value = value;
        System.out.println("Loading " + value);
    }

    @Override
    public void doing() {
        System.out.println("==execute " + value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
