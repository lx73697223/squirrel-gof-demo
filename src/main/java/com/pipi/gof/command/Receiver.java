package com.pipi.gof.command;

/**
 命令的接收者，知道如何实施与执行一个请求相关的操作
 */
public class Receiver {

    public void do1() {
        System.out.println("==do 1==");
    }

    public void do2() {
        System.out.println("==do 2==");
    }

}
