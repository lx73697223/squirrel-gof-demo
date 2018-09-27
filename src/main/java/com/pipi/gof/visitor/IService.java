package com.pipi.gof.visitor;

/**
 接收访问者的功能 */
public interface IService {

    void accept(ServiceVisitor serviceVisitor);

}
