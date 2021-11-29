package com.narae.design.command.myexample;

/**
 * The Client in Command Pattern.
 * The ShortcutLoader creates a number of Command Objects that are loaded into the slots of the Shortcut Manager.
 * Each command object encapsulates a request of a receiver.
 */
public class ShortcutLoader {
    public static void main(String[] args) {
        // The shortcutManager is the Invoker; it will be passed command objects that can be used to make requests.
        ShortcutManager shortcutManager = new ShortcutManager();

        // The Receiver of the request.
        // Create all the receivers.
        NetworkService cmService = new NetworkService("CM");
        NetworkService fmService = new NetworkService("FM");
        NetworkService logService = new NetworkService("Log");
        VirtualNetworkFunction cmVNF = new VirtualNetworkFunction("CM");
        VirtualNetworkFunction fmVNF = new VirtualNetworkFunction("FM");
        VirtualNetworkFunction logVNF = new VirtualNetworkFunction("Log");

        // Create commands and pass the receiver to them.
        ServiceEnableCommand cmServiceEnable = new ServiceEnableCommand(cmService);
        ServiceDisableCommand cmServiceDisable = new ServiceDisableCommand(cmService);
        ServiceEnableCommand fmServiceEnable = new ServiceEnableCommand(fmService);
        ServiceDisableCommand fmServiceDisable = new ServiceDisableCommand(fmService);
        ServiceEnableCommand logServiceEnable = new ServiceEnableCommand(logService);
        ServiceDisableCommand logServiceDisable = new ServiceDisableCommand(logService);
        VNFTrafficHighCommand cmVNFTrafficHigh = new VNFTrafficHighCommand(cmVNF);
        VNFTrafficLowCommand cmVNFTrafficLow = new VNFTrafficLowCommand(cmVNF);
        VNFNotExistCommand cmVNFNotExist = new VNFNotExistCommand(cmVNF);
        VNFTrafficHighCommand fmVNFTrafficHigh = new VNFTrafficHighCommand(fmVNF);
        VNFTrafficLowCommand fmVNFTrafficLow = new VNFTrafficLowCommand(fmVNF);
        VNFNotExistCommand fmVNFNotExist = new VNFNotExistCommand(fmVNF);
        VNFTrafficHighCommand logVNFTrafficHigh = new VNFTrafficHighCommand(logVNF);
        VNFTrafficLowCommand logVNFTrafficLow = new VNFTrafficLowCommand(logVNF);
        VNFNotExistCommand logVNFNotExist = new VNFNotExistCommand(logVNF);

        // Create MacroCommands.
        Command[] allEnbale = {cmServiceEnable, fmServiceEnable, logServiceEnable, cmVNFTrafficHigh, fmVNFTrafficHigh, logVNFTrafficHigh};
        Command[] allDisable = {cmServiceDisable, fmServiceDisable, logServiceDisable, cmVNFNotExist, fmVNFNotExist, logVNFNotExist};
        MacroCommand allEnableMacro = new MacroCommand(allEnbale);
        MacroCommand allDisableMacro = new MacroCommand(allDisable);

        // Pass the command to the Invoker.
        shortcutManager.setCommand(0, cmServiceEnable, cmServiceDisable);
        shortcutManager.setCommand(1, fmServiceEnable, fmServiceDisable);
        shortcutManager.setCommand(2, logServiceEnable, logServiceDisable);
        shortcutManager.setCommand(3, cmVNFTrafficHigh, cmVNFNotExist);
        shortcutManager.setCommand(4, cmVNFTrafficLow, cmVNFNotExist);
        shortcutManager.setCommand(5, fmVNFTrafficHigh, fmVNFNotExist);
        shortcutManager.setCommand(6, fmVNFTrafficLow, fmVNFNotExist);
        shortcutManager.setCommand(7, logVNFTrafficHigh, logVNFNotExist);
        shortcutManager.setCommand(8, logVNFTrafficLow, logVNFNotExist);
        shortcutManager.setCommand(9, allEnableMacro, allDisableMacro);

        // Simulate the buttons being pressed.
        shortcutManager.enablingShortcutWasPressed(0);
        shortcutManager.disablingShortcutWasPressed(0);
        System.out.println(shortcutManager);
        shortcutManager.undoShortcutWasPressed();
        shortcutManager.enablingShortcutWasPressed(1);
        shortcutManager.disablingShortcutWasPressed(1);
        shortcutManager.enablingShortcutWasPressed(2);
        shortcutManager.disablingShortcutWasPressed(2);
        shortcutManager.enablingShortcutWasPressed(3);
        shortcutManager.disablingShortcutWasPressed(3);
        System.out.println(shortcutManager);
        shortcutManager.undoShortcutWasPressed();
        shortcutManager.enablingShortcutWasPressed(4);
        shortcutManager.disablingShortcutWasPressed(4);
        System.out.println(shortcutManager);
        System.out.println("--- Pushing Macro Enable---");
        shortcutManager.enablingShortcutWasPressed(9);
        System.out.println("--- Pushing Macro Disable---");
        shortcutManager.disablingShortcutWasPressed(9);
    }
}
