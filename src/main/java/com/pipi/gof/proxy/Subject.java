package com.pipi.gof.proxy;

/**
 定义ConcreteSubject与Proxy的共用接口，从而在任何使用ConcreteSubject的地方都可以使用Proxy。
 */
public interface Subject {

      void doing();

}
