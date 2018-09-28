package com.pipi.gof.command;

public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        ICommand command = new CommandImpl1(receiver);

        CommandCaller invoker = new CommandCaller(command);

        invoker.executeCommand();
    }
}
