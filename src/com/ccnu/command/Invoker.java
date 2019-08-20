package com.ccnu.command;

public class Invoker {
    private Command[] onCommand;
    private Command[] offCommand;
    private final  int soltNum = 7;

    public Invoker(){
        this.onCommand = new Command[soltNum];
        this.offCommand = new Command[soltNum];
    }

    public void setOnCommand(Command command,int solt){
        onCommand[solt] = command;
    }

    public void setOffCommand(Command command,int solt){
        offCommand[solt] = command;
    }

    //根据不同的按钮的话执行不同的命令
    public void buttonOnPush(int solt){
        onCommand[solt].execute();
    }

    public void buttonOffPush(int solt){
        offCommand[solt].execute();
    }

}
