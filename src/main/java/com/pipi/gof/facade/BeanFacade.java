package com.pipi.gof.facade;

public class BeanFacade {

    private IBean beanImpl1;

    private IBean beanImpl2;

    private IBean beanImpl3;

    public BeanFacade() {
        this.beanImpl1 = new BeanImpl1();
        this.beanImpl2 = new BeanImpl2();
        this.beanImpl3 = new BeanImpl3();
    }

    public void do1() {
        beanImpl1.doing();
    }

    public void do2() {
        beanImpl2.doing();
    }

    public void do3() {
        beanImpl3.doing();
    }

}
