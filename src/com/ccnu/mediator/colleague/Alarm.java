package com.ccnu.mediator.colleague;

import com.ccnu.mediator.cpu.Mediator;

/**
 * 对于每一个同事身上都是有一个Mediator的
 */
public class Alarm extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void alarm(){

        System.out.println("doAlarm");
    }
}
