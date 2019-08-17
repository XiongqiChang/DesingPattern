package com.ccnu.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //定义的是一系列的观察者对象
    List<Observer> observerList = new ArrayList<>();
    private int  state;

    public int getState(){
        return  state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }


    public void  notifyAllObserver(){
        for(Observer ob : observerList){
            ob.update();
        }
    }
}
