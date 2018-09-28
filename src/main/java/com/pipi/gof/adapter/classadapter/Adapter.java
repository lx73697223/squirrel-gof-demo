package com.pipi.gof.adapter.classadapter;

public class Adapter extends Adaptee implements Target {

    public void doing(String name, String value) {
        System.out.println("adapter doing. name: " + value + ", value: " + value);
        this.specificDoing(name, value);
    }

}
