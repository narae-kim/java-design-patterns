package com.narae.design.command.myexample;

public class VNFTrafficLowCommand implements Command {
    private VirtualNetworkFunction virtualNetworkFunction;
    private int prevNumberOfInstances;

    public VNFTrafficLowCommand(VirtualNetworkFunction virtualNetworkFunction) {
        this.virtualNetworkFunction = virtualNetworkFunction;
    }

    @Override
    public void execute() {
        // Record its previous state
        prevNumberOfInstances = virtualNetworkFunction.getNumberOfInstances();
        virtualNetworkFunction.setTrafficLow();
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
