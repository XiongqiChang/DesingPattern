package com.ccnu.simplefactory;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //实例化各种食物,这样我就不需要自己去new出这么多的食物了
        Food egg = FoodFactory.getFood("egg");
        Food chip = FoodFactory.getFood("chip");

        if(egg != null){
            egg.get();
        }
        if(chip != null)
            chip.get();
    }
}
