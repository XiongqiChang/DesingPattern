package com.ccnu.decator;

import com.ccnu.simplefactory.Egg;

public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new BatterCake();
        aBattercake = new EggDector(aBattercake);
        aBattercake = new EggDector(aBattercake);
        System.out.println(aBattercake.desc() + aBattercake.cost());
    }
}
