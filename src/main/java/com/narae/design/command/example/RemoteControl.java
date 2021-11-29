package com.narae.design.command.example;

/**
 * The Invoker in Command Pattern.
 * The RemoteControl manages a set of Command objects, one per button.
 * When a button is pressed the corresponding ButtonWasPressed() method is called, which invokes the execute() method on the command.
 * That is the full extent of the remote's knowledge of the classes it's invoking as the Command object decouples the remote from the classes doing the actual home-automation work.
 */
public class RemoteControl {
    // This remove is going to handle seven On and Off commands.
    Command[] onCommands;
    Command[] offCommands;
    // Stash the last command executed for the undo button.
    Command undoCommand;

    public RemoteControl() {
        // Instantiate and initialise the on and off arrays.
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        /* No need to check if a command was loaded every time we referenced a slot, for example,
        public void onButtonPressed(int slot) {
            if (onCommands[slot] != null) {
                onCommands[slot].execute();
            }
        }
         */
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * The setCommand() is called if the client wants to change the behavior of the remote buttons.
     * The setCommand() method takes three arguments and puts them in the on and off arrays for later use.
     *
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        // Save a reference to the command in the undoCommand instance variable.
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * It reverses the operation of the last command executed.
     */
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("------------ Remote Control ---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "\t\t\t" + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
