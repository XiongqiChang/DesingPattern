package com.ccnu.mediator.colleague;

import com.ccnu.mediator.cpu.Mediator;

public class Calender extends  Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender(){
        System.out.println("doCalender()");
    }
}
