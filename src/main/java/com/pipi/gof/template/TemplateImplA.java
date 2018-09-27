package com.pipi.gof.template;

public class TemplateImplA extends AbstractTemplate {

    @Override
    protected void do1() {
        System.out.println("A do 1");
    }

    @Override
    protected void do2() {
        System.out.println("A do 2");
    }

    @Override
    protected void do3() {
        System.out.println("A do 3");
    }
}
