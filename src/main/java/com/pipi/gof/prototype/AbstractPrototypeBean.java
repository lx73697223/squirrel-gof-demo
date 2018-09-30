package com.pipi.gof.prototype;

/**
 原型类，声明一个Clone自身的接口
 */
public abstract class AbstractPrototypeBean implements Cloneable {

    private String id;

    protected String type;

    abstract void print();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
