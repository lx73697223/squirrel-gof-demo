package com.pipi.gof.factory.simple;

import org.springframework.stereotype.Component;

@Component
public class SimpleFactoryBeanImpl1 implements ISimpleFactoryBean {

    @Override
    public void print() {
        System.out.println("==1=="+this.getClass().getSimpleName());
    }

}
