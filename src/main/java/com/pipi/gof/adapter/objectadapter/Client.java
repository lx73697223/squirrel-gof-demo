package com.pipi.gof.adapter.objectadapter;

/**
 与符合Target接口的对象协调的类
 */
public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.doing("thename", "thevalue");
    }

}
