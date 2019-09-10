package com.ccnu.decator;

public class EggDector extends ADecator {


    public EggDector(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String desc() {
        return super.desc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
