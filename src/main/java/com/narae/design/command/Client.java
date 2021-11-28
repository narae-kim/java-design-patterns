package com.narae.design.command;

/**
 * The Client is responsible for creating a ConcreteCommand and setting its Receiver.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver();

        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        invoker.setCommand(concreteCommand);
    }
}
