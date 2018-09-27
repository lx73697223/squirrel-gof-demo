package com.pipi.gof.visitor;

public class ServiceVisitorImplA implements ServiceVisitor {

    @Override
    public void visit(ServiceImpl1 serviceImpl1) {
        System.out.println("A visit serviceImpl1. arg: " + serviceImpl1.getArg1());
    }

    @Override
    public void visit(ServiceImpl2 serviceImpl2) {
        System.out.println("A visit serviceImpl2. arg: " + serviceImpl2.getArg2());
    }

    @Override
    public void visit(ServiceImpl3 serviceImpl3) {
        System.out.println("A visit serviceImpl3. arg: " + serviceImpl3.getArg3());
    }

    @Override
    public void visit(ServiceImplComposite123 serviceImplComposite123) {
        System.out.println(
                "A visit serviceImplComposite123. arg: " + serviceImplComposite123.getArg123());
    }

}
