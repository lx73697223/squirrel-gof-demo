package com.pipi.gof.decorator;

public class BeanDecoratorImplA extends AbstractBeanDecorator {

    public BeanDecoratorImplA(IBean decoratedBean) {
        super(decoratedBean);
    }

    @Override
    public void doing() {
        super.doing();
        System.out.println("==do A==");
    }

}
