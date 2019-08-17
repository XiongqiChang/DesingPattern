package com.ccnu.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Concreprototype("abc");
         Prototype  clone =  prototype.myClone();
        System.out.println(clone.toString());
    }
}
