package com.pipi.gof.factory.abstraction;

/**
 抽象工厂
 */
public abstract class AbstractionAbstractFactory {

    public abstract IAbstractionFactoryBeanA getBeanA(Integer type);

    public abstract IAbstractionFactoryBeanB getBeanB(Integer type);

}
