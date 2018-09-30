package com.pipi.gof.facade;

/**
 知道哪些子系统类负责处理请求
 将客户的请求代理给相应的子系统对象
 */
public class BeanFacade {

    private Bean1 bean1;

    private Bean2 bean2;

    private Bean3 bean3;

    public BeanFacade() {
        this.bean1 = new Bean1();
        this.bean2 = new Bean2();
        this.bean3 = new Bean3();
    }

    public void doA() {
        bean1.do1();
        bean2.do2();
        bean3.do3();
    }

    public void doB() {
        bean3.do3();
        bean2.do2();
        bean1.do1();
    }

    public void doC() {
        bean2.do2();
        bean1.do1();
        bean3.do3();
    }

}
