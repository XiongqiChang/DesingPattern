package com.ccnu.simplefactory;

public class FoodFactory {

    public static Food getFood(String foodType) throws IllegalAccessException, InstantiationException {

        if(foodType.equalsIgnoreCase("chip")){
            return  Chip.class.newInstance();
        }else if(foodType.equalsIgnoreCase("egg")){
            return  Egg.class.newInstance();
        }else {
            System.out.println("没有这种食品");
            return  null;
        }
    }

}
