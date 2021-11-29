package com.narae.design.command.example;

/**
 * All command objects implement the same interface, which consists of one method.
 * All RemoteControl commands implement the Command interface, which consists of one method: execute().
 * Commands encapsulate a set of actions on a specific vendor class.
 * The remote invokes these actions by calling the execute() method.
 */
public interface Command {
    void execute();

    void undo();
}
