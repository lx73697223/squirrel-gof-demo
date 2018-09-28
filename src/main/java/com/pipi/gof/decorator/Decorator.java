package com.pipi.gof.decorator;

/**
 维持一个指向 Component 的指针。
 Decorator 也实现 Component 接口，所以继承 Decorator 的类可以使用 Component 的方法，
 再在 Decorator 的子类里面加入一些新的方法，也就是装饰，就成为了一个包装好的装饰类。
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doing() {
        System.out.println("Decorator doing start...");

        if (component!= null) {
            component.doing();
        }

        System.out.println("Decorator doing end.");
    }

}
