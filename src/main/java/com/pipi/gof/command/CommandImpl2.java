package com.pipi.gof.command;

public class CommandImpl2 extends AbstractCommand {

    public CommandImpl2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("==execute 2==");
        receiver.do1();
    }

}
