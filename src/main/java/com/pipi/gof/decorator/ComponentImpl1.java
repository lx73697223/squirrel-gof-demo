package com.pipi.gof.decorator;

/**
 定义一个对象，可以给这个对象添加一些职责
 */
public class ComponentImpl1 implements Component {

    @Override
    public void doing() {
        System.out.println("ComponentImpl1 doing");
    }

}
