package com.pipi.gof.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        IService service = new ServiceImplComposite123(">>123<<");
        service.accept(new ServiceVisitorImplA());
    }

}
