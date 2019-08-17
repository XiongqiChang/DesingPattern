package com.ccnu.observer;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

public class BinaryObserver extends  Observer {


    public  BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String " + Integer.toBinaryString(subject.getState()));
    }
}
