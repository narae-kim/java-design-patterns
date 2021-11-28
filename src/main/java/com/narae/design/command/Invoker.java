package com.narae.design.command;

/**
 * The Invoker holds a command and at some point asks the command to carry out a request by calling its execute() method.
 */
public class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
}
