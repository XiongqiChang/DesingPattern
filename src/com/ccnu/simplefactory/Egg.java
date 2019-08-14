package com.ccnu.simplefactory;

public class Egg implements  Food {
    @Override
    public void get() {
        System.out.println("我要一个鸡蛋");
    }
}
