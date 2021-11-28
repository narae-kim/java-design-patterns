package com.narae.design.command;

/**
 * The ConcreteCommand defines a binding between an action and a Receiver.
 * The Invoker makes a request by calling execute() and the ConcreteCommand carries it out by calling out actions on the Receiver.
 */
public class ConcreteCommand implements Command {
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * The execute() method invokes the action(s) on the receiver needed to fulfill the request.
     */
    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {

    }
}
