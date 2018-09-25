package com.pipi.gof.command;

public class CommandImpl1 implements ICommand {

    private Request request;

    public CommandImpl1(Request request) {
        this.request = request;
    }

    public void execute() {
        System.out.println("==execute 1==");
        request.do1();
    }

}
