package com.narae.design.command.myexample;

public class ServiceDisableCommand implements Command {
    private NetworkService networkService;

    public ServiceDisableCommand(NetworkService networkService) {
        this.networkService = networkService;
    }

    @Override
    public void execute() {
        networkService.delete();
    }

    @Override
    public void undo() {
        networkService.onboard();
        networkService.distribute();
        networkService.instantiate();
    }
}
