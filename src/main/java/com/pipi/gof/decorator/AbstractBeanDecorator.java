package com.pipi.gof.decorator;

public abstract class AbstractBeanDecorator implements IBean {

    protected IBean decoratedBean;

    public AbstractBeanDecorator(IBean decoratedBean) {
        this.decoratedBean = decoratedBean;
    }

    public void doing() {
        decoratedBean.doing();
    }

}
