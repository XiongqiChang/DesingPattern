package com.ccnu.mediator.colleague;

import com.ccnu.mediator.cpu.Mediator;

public  class CoffePort extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffe()");
    }

    public void doCoffee(){
        System.out.println("doCoffee()");
    }
}
