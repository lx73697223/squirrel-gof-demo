package com.pipi.gof.visitor;

public class VisitorImplA implements Visitor {

    @Override
    public void visit1(ServiceImpl1 serviceImpl1) {
        System.out.println("A visit serviceImpl1. arg: " + serviceImpl1.getArg1());
    }

    @Override
    public void visit2(ServiceImpl2 serviceImpl2) {
        System.out.println("A visit serviceImpl2. arg: " + serviceImpl2.getArg2());
    }

    @Override
    public void visit3(ServiceImpl3 serviceImpl3) {
        System.out.println("A visit serviceImpl3. arg: " + serviceImpl3.getArg3());
    }

}
