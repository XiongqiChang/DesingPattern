package com.ccnu.mediator;

import com.ccnu.mediator.colleague.Alarm;
import com.ccnu.mediator.colleague.Calender;
import com.ccnu.mediator.colleague.CoffePort;
import com.ccnu.mediator.cpu.MainMedator;
import com.ccnu.mediator.cpu.Mediator;


public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Calender calender = new Calender();
        CoffePort coffePort = new CoffePort();
        Mediator mediator = new MainMedator(alarm,calender,coffePort);
        mediator.doEvent("alarm");
    }
}
