package com.pipi.gof.factory.abstraction;

public class AbstractionBeanBFactory extends AbstractionAbstractFactory {

    @Override
    public IAbstractionFactoryBeanA getBeanA(Integer type) {
        return null;
    }

    @Override
    public IAbstractionFactoryBeanB getBeanB(Integer type) {
        if (type == null) {
            return null;
        }

        if (type.equals(0)) {
            return new AbstractionFactoryBeanImplB0();
        } else if (type.equals(1)) {
            return new AbstractionFactoryBeanImplB1();
        } else if (type.equals(2)) {
            return new AbstractionFactoryBeanImplB2();
        }

        return null;
    }

}
