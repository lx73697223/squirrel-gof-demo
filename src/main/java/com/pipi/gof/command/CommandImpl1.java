package com.pipi.gof.command;

/**
 定义一个接收者对象与动作之间的请求绑定 */
public class CommandImpl1 extends AbstractCommand {

    public CommandImpl1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("==execute 1==");
        receiver.do1();
    }

}
