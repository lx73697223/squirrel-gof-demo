package com.pipi.gof.factory.simple;

import org.springframework.stereotype.Component;

@Component
public class SimpleFactoryBeanImpl2 implements ISimpleFactoryBean {

    @Override
    public void print() {
        System.out.println("==2=="+this.getClass().getSimpleName());
    }

}
