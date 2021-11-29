package com.narae.design.command.myexample;

/**
 * A command for enabling a network service.
 * The Command Object holds a reference to an object that is an instance of a Vendor Class and implements an execute method that calls one or more methods on that object.
 */
public class ServiceEnableCommand implements Command {
    private NetworkService networkService;

    /**
     * The argument takes the specific network service that execute() is going to control.
     * When execute() gets called, this is the network service object that is going to be the Receiver of the request.
     *
     * @param networkService
     */
    public ServiceEnableCommand(NetworkService networkService) {
        this.networkService = networkService;
    }

    /**
     * The execute() method calls the onboard(), distribute() and instantiate() methods on the receiving object which is the network service we are controlling.
     */
    @Override
    public void execute() {
        networkService.onboard();
        networkService.distribute();
        networkService.instantiate();
    }

    @Override
    public void undo() {
        networkService.delete();
    }
}
