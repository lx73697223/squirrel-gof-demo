package com.pipi.gof.command;

public class CommandCaller {

    private ICommand command;

    public CommandCaller(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
