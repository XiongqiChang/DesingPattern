package com.ccnu.simplefactory;

public class Chip implements Food {
    @Override
    public void get() {
        System.out.println("我要份薯条");
    }
}
