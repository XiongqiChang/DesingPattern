package com.ccnu.responsibility;

public class ChainPattern {

    private  static  AbstractLogger getChainLogger(){
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger eror = new ErrorMessage(AbstractLogger.ERROR);
        AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
        console.setNext(eror);
        eror.setNext(file);
        //从console的这个地方开始的
        return  console;
    }

    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainLogger();
        abstractLogger.logMessage(AbstractLogger.DEBUG,"Debug information");
        abstractLogger.logMessage(AbstractLogger.ERROR,"error infomation ");
        abstractLogger.logMessage(AbstractLogger.INFO,"info message");
    }
}
