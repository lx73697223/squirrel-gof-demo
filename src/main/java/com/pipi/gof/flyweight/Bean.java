package com.pipi.gof.flyweight;

public class Bean {

    private int type;

    public Bean(int type) {
        this.type = type;
    }

    public void doing() {
        System.out.println("==do 1==");
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
