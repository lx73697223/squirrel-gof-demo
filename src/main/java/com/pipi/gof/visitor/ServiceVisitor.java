package com.pipi.gof.visitor;

/**
 访问者接口 */
public interface ServiceVisitor {

    void visit(ServiceImpl1 serviceImpl1);

    void visit(ServiceImpl2 serviceImpl2);

    void visit(ServiceImpl3 serviceImpl3);

    void visit(ServiceImplComposite123 serviceImplComposite123);

}
