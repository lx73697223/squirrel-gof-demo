package com.pipi.gof.visitor;

public class ServiceImpl1 implements IService {

    private String arg1;

    public ServiceImpl1(String arg1) {
        this.arg1 = arg1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit1(this);
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }
}
