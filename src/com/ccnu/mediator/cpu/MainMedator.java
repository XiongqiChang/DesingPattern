package com.ccnu.mediator.cpu;

import com.ccnu.mediator.colleague.Alarm;
import com.ccnu.mediator.colleague.Calender;
import com.ccnu.mediator.colleague.CoffePort;


/**
 * 定义一个具体的调停者
 */

public class MainMedator implements  Mediator {

    private Alarm alarm;
    private Calender calender;
    private CoffePort  coffePort;

    /**
     * 构造方法
     * @param alarm
     * @param calender
     * @param coffePort
     */
    public MainMedator(Alarm alarm, Calender calender, CoffePort coffePort){
        this.alarm = alarm;
        this.calender = calender;
        this.coffePort = coffePort;
    }

    @Override
    public void doEvent(String c) {
        switch (c){
            case "alarm":
                doAlarmEvent();
                break;
            case  "coffee":
                doCoffeeEvent();
                break;
            default:
                doCalenderEvent();

        }
    }
    private void doCalenderEvent() {
    }

    private void doCoffeeEvent() {
    }

    //以闹钟为例，闹钟响了的时候，调用其他的方法
    public void doAlarmEvent(){
        alarm.alarm();
        coffePort.doCoffee();
        calender.doCalender();
    }

    
}
