package com.ccnu.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new OctalObserver(subject);
        Observer observer2 = new BinaryObserver(subject);
        System.out.println("first change");
        subject.setState(15);
    }
}
