package com.pipi.gof.template;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        AbstractTemplate templateA = new TemplateImplA();
        templateA.doing();

        System.out.println("----");

        AbstractTemplate templateB = new TemplateImplB();
        templateB.doing();
    }

}
