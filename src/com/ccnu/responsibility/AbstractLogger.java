package com.ccnu.responsibility;

public abstract class AbstractLogger {

    public static  int INFO = 1;
    public static int DEBUG = 2;
    public static  int  ERROR = 3;

    protected  int level;
    //设置下一个处理者
    protected  AbstractLogger next;

    public void setNext(AbstractLogger next){
        this.next = next;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }else  if(next != null){
            next.logMessage(level,message);
        }
    }

    abstract  void write (String message);
}
