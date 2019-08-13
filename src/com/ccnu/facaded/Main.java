package com.ccnu.facaded;

public class Main {

    public static void main(String[] args) {
        //这样我就只需要直接new出一个facade既可以了,而不需要自己一个个去开了
        Faced faced = new Faced();
        faced.open();
    }
}
