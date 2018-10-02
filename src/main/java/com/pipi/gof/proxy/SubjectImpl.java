package com.pipi.gof.proxy;

/**
 定义Proxy所代表的Subject。
 */
public class SubjectImpl implements Subject {

    private String value;

    public SubjectImpl(String value) {
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
