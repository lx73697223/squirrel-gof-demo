package com.pipi.gof.command;

public class CommandImpl2 implements ICommand {

    private Request request;

    public CommandImpl2(Request request) {
        this.request = request;
    }

    public void execute() {
        System.out.println("==execute 2==");
        request.do2();
    }

}
