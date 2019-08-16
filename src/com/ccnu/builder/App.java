package com.ccnu.builder;

public class App {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        final  int count = 26;
        for(int i = 0; i < count; i++){

            stringBuilder.append((char)('a' + i));
        }
        System.out.println(stringBuilder.toString());
    }
}
