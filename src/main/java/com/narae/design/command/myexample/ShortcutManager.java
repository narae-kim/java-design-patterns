package com.narae.design.command.myexample;

/**
 * The Invoker in Command Pattern.
 * The ShortcutManager manages a set of Command objects, one per shortcut key.
 * When a key is pressed the corresponding ShortcutWasPressed() method is called, which invokes the execute() method on the command.
 * That is the full extent of the shortcut manager's knowledge of the classes it's invoking as the Command object decouples the shortcut manager from the classes doing the actual work.
 */
public class ShortcutManager {
    private static final int NUM_OF_SHORTCUT = 10;
    Command[] enablingCommands;
    Command[] disablingCommands;
    // Stash the last command executed for the undo button.
    Command undoCommand;

    public ShortcutManager() {
        // Instantiate and initialise the enabling and disabling arrays.
        enablingCommands = new Command[NUM_OF_SHORTCUT];
        disablingCommands = new Command[NUM_OF_SHORTCUT];

        Command noCommand = new NoCommand();
        /* No need to check if a command was loaded every time we referenced a slot, for example,
        public void enablingShortcutWasPressed(int slot) {
            if (enablingCommands[slot] != null) {
                enablingCommands[slot].execute();
            }
        }
         */
        for (int i = 0; i < NUM_OF_SHORTCUT; i++) {
            enablingCommands[i] = noCommand;
            disablingCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * The setCommand() is called if the client wants to change the behavior of the shortcut keys.
     * The setCommand() method takes three arguments and puts them in the enabling and disabling arrays for later use.
     *
     * @param slot
     * @param enablingCommand
     * @param disablingCommand
     */
    public void setCommand(int slot, Command enablingCommand, Command disablingCommand) {
        enablingCommands[slot] = enablingCommand;
        disablingCommands[slot] = disablingCommand;
    }

    public void enablingShortcutWasPressed(int slot) {
        enablingCommands[slot].execute();
        // Save a reference to the command in the undoCommand instance variable.
        undoCommand = enablingCommands[slot];
    }

    public void disablingShortcutWasPressed(int slot) {
        disablingCommands[slot].execute();
        undoCommand = disablingCommands[slot];
    }

    /**
     * It reverses the operation of the last command executed.
     */
    public void undoShortcutWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("------------ Shortcut ---------------\n");
        for (int i = 0; i < enablingCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + enablingCommands[i].getClass().getName() + "\t\t\t" + disablingCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
