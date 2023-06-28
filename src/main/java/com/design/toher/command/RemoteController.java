package com.design.toher.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteController {
    private Map<String, Command> commands;

    public RemoteController() {
        commands = new HashMap<>();
    }

    public void setCommand(String button, Command command) {
        commands.put(button, command);
    }

    public void pressButton(String button) {
        if (commands.containsKey(button)) {
            Command command = commands.get(button);
            command.execute();
        } else {
            System.out.println("Button not found!");
        }
    }
}
