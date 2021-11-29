package com.narae.design.command.example;

/**
 * A command for turning a light on.
 * Using the Command interface, each action that can be invoked by pressing a button on the remote is implemented with a simple Command object.
 * The Command Object holds a reference to an object that is an instance of a Vendor Class and implements an execute method that calls one or more methods on that object.
 */
public class LightOnCommand implements Command {
    Light light;

    /**
     * The argument takes the specific light that execute() is going to control.
     * When execute() gets called, this is the light object that is going to be the Receiver of the request.
     *
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * The execute() method calls the on() method on the receiving object, which is the light we are controlling.
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() { light.off(); }
}
