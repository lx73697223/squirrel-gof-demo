package com.pipi.gof.factory.method;

public class Client {

    public static void main(String[] args) {

        AbstractFactory factoryA = new BeanFactoryA();
        factoryA.getBean().print();

        AbstractFactory factoryB = new BeanFactoryB();
        factoryB.getBean().print();
    }

}
