package com.pipi.gof.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        IService service = new ServiceImpl1(">>.<<");
        service.accept(new VisitorImplA());

        service = new ServiceImpl2("<<.>>");
        service.accept(new VisitorImplA());

        service = new ServiceImpl2("><.><");
        service.accept(new VisitorImplB());

        service = new ServiceImpl3("<>.<>");
        service.accept(new VisitorImplB());
    }

}
