package com.ccnu.proxy;

public class RealImage implements  Image {

    private String filename;

    /**
     * 在初始化的时候就要进行的是加载
     * @param filename
     */
    public  RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }
    @Override
    public void display() {
        System.out.println("display" + filename);
    }

    public void loadFromDisk(String filename){
        System.out.println("loading" + filename);
    }
}
