package com.pipi.gof.visitor;

public class ServiceImpl2 implements IService {

    private String arg2;

    public ServiceImpl2(String arg2) {
        this.arg2 = arg2;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit2(this);
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }
}
