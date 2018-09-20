package com.pipi.gof.factory.abstraction;

public class AbstractionBeanAFactory extends AbstractionAbstractFactory {

    @Override
    public IAbstractionFactoryBeanA getBeanA(Integer type) {
        if (type == null) {
            return null;
        }

        if (type.equals(0)) {
            return new AbstractionFactoryBeanImplA0();
        } else if (type.equals(1)) {
            return new AbstractionFactoryBeanImplA1();
        } else if (type.equals(2)) {
            return new AbstractionFactoryBeanImplA2();
        }

        return null;
    }

    @Override
    public IAbstractionFactoryBeanB getBeanB(Integer type) {
        return null;
    }

}
