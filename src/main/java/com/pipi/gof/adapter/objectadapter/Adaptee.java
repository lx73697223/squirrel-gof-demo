package com.pipi.gof.adapter.objectadapter;

/**
 需要适配的类接口
 */
public class Adaptee {

    public void specificDoing(String name, String value) {
        System.out.println("specific doing. name: " + value + ", value: " + value);
    }

}
