package com.pipi.gof.adapter.objectadapter;

/**
 实现适配器的功能，负责Adaptee的接口与Target接口进行适配
 在Client与Adaptee之间加入Adapter，这样Client把请求发给接口为Target的类Adapter，
 再由Adapter调用Adaptee，从而实现Client调用Adaptee。 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doing(String name, String value) {
        System.out.println("adapter doing. name: " + value + ", value: " + value);
        adaptee.specificDoing(name, value);
    }

}
