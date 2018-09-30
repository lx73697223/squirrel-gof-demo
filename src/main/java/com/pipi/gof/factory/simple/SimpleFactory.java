package com.pipi.gof.factory.simple;

/**
 简单工厂类
 */
public class SimpleFactory {

    public ISimpleFactoryBean getBean(Integer index) {
        if (index == null) {
            return null;
        }

        if (index.equals(0)) {
            return new SimpleFactoryBeanImpl0();
        } else if (index.equals(1)) {
            return new SimpleFactoryBeanImpl1();
        } else if (index.equals(2)) {
            return new SimpleFactoryBeanImpl2();
        }

        return null;
    }

}
