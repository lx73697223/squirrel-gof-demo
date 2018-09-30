package com.pipi.gof.factory.abstraction;

public class Client {

    public static void main(String[] args) {

        AbstractFactory factory0 = new BeanFactory0();

        Producer producer0 = new Producer(factory0);

        producer0.doing();

        AbstractFactory factory1 = new BeanFactory1();

        Producer producer1 = new Producer(factory1);

        producer1.doing();
    }

}
