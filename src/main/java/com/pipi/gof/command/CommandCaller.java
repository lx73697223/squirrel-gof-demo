package com.pipi.gof.command;

import java.util.ArrayList;
import java.util.List;

public class CommandCaller {

    private List<ICommand> commandList = new ArrayList<ICommand>();

    public void addCommand(ICommand command) {
        commandList.add(command);
    }

    public void handleCommands() {
        for (ICommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
