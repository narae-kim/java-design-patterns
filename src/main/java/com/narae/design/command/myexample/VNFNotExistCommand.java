package com.narae.design.command.myexample;

public class VNFNotExistCommand implements Command {
    private VirtualNetworkFunction virtualNetworkFunction;
    private int prevNumberOfInstances;

    public VNFNotExistCommand(VirtualNetworkFunction virtualNetworkFunction) {
        this.virtualNetworkFunction = virtualNetworkFunction;
    }

    @Override
    public void execute() {
        // Record its previous state
        prevNumberOfInstances = virtualNetworkFunction.getNumberOfInstances();
        virtualNetworkFunction.setNotExist();
        virtualNetworkFunction.instantiate();
    }

    @Override
    public void undo() {
        if (prevNumberOfInstances == VirtualNetworkFunction.TRAFFIC_HIGH) {
            virtualNetworkFunction.setTrafficHigh();
            virtualNetworkFunction.instantiate();
        } else if (prevNumberOfInstances == VirtualNetworkFunction.TRAFFIC_LOW) {
            virtualNetworkFunction.setTrafficLow();
            virtualNetworkFunction.instantiate();
        } else if (prevNumberOfInstances == VirtualNetworkFunction.NOT_EXIST) {
            virtualNetworkFunction.delete();
        }
    }
}
