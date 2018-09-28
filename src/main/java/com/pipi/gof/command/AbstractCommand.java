package com.pipi.gof.command;

public abstract class AbstractCommand implements ICommand {

    protected Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

}
