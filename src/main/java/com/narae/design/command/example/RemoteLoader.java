package com.narae.design.command.example;

/**
 * The Client in Command Pattern.
 * The RemoteLoader creates a number of Command Objects that are loaded into the slots of the Remote Control.
 * Each command object encapsulates a request of a home automation device.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        // The remove is the Invoker; it will be passed command objects that can be used to make requests.
        RemoteControl remoteControl = new RemoteControl();

        // The Receiver of the request.
        // Create all the devices in the proper locations.
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Light officeLight = new Light("Office");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        // Create commands and pass the Receiver to them.
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand officeLightOn = new LightOnCommand(officeLight);
        LightOffCommand officeLightOff = new LightOffCommand(officeLight);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        // Create MacroCommands.
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, officeLightOn, stereoOn};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, officeLightOff, stereoOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Pass the command to the Invoker.
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, officeLightOn, officeLightOff);
        remoteControl.setCommand(3, stereoOn, stereoOff);
        //remoteControl.setCommand(4, ceilingFanHighCommand, ..);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        // Simulate the buttons being pressed.
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPressed(5);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPressed(5);
    }
}
