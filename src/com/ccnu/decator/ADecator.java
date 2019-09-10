package com.ccnu.decator;

public class ADecator extends  ABattercake {

    private  ABattercake aBattercake;
    public  ADecator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }
    @Override
    protected String desc() {
        return this.aBattercake.desc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
