package com.ccnu.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command commandLightOn = new LightCommand(light);
        Command commandLightOff = new LightOffCommand(light);
        invoker.setOnCommand(commandLightOn,0);
        invoker.setOffCommand(commandLightOff,1);
        invoker.buttonOnPush(0);
        invoker.buttonOffPush(1);

    }
}
