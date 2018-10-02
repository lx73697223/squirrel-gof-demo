package com.pipi.gof.visitor;

/**
 访问者接口 */
public interface Visitor {

    void visit1(ServiceImpl1 serviceImpl1);

    void visit2(ServiceImpl2 serviceImpl2);

    void visit3(ServiceImpl3 serviceImpl3);

}
