package com.narae.design.command.myexample;

/**
 * Not implementing as a Command so that it can avoid hardcoding the executing all mode into the macro command.
 * MacroCommand, you can decide dynamically which Commands you want to go into, e.g., AllEnableMacroCommand, so you have more flexibility using MacroCommand.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
