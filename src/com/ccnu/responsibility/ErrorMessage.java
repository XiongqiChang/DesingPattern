package com.ccnu.responsibility;

public class ErrorMessage extends  AbstractLogger {

    public ErrorMessage(int level){
        this.level  = level;
    }
    @Override
    public void  write(String message) {
        System.out.println("Error" + message);
    }
}
