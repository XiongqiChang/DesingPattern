package com.ccnu.decator;

public class BatterCake extends  ABattercake {
    @Override
    protected String desc() {
        return "这个是煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
