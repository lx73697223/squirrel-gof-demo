package com.pipi.gof.visitor;

public class ServiceImpl3 implements IService {

    private String arg3;

    public ServiceImpl3(String arg3) {
        this.arg3 = arg3;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit3(this);
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }
}
