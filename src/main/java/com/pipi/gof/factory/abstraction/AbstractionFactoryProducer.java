package com.pipi.gof.factory.abstraction;

public class AbstractionFactoryProducer {

    public static AbstractionAbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        if (factoryType.equalsIgnoreCase("A")) {
            return new AbstractionBeanAFactory();
        } else if (factoryType.equalsIgnoreCase("B")) {
            return new AbstractionBeanBFactory();
        }

        return null;
    }

}
