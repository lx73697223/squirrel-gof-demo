package com.pipi.gof.visitor;

public class ServiceImplComposite123 implements IService {

    private static final IService[] services = new IService[] { new ServiceImpl1(),
            new ServiceImpl2(), new ServiceImpl3() };

    private String arg123;

    public ServiceImplComposite123(String arg123) {
        this.arg123 = arg123;
    }

    @Override
    public void accept(ServiceVisitor serviceVisitor) {
        for (int i = 0; i < services.length; i++) {
            services[i].accept(serviceVisitor);
        }

        serviceVisitor.visit(this);
    }

    public String getArg123() {
        return arg123;
    }

    public void setArg123(String arg123) {
        this.arg123 = arg123;
    }

}
