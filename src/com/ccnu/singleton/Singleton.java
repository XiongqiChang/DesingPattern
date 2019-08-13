package com.ccnu.singleton;

/**
 *单例模式的介绍
 * 每一次只会创建一个实例，一般的常见的实现方法有懒汉式，饿汉式，加锁，双重加锁，以及使用静态内部类，枚举
 */


/**
 * 这个方法介绍的是最简单的一种方式，就是饿汉式，不会存在线程的安全问题，，每次在加载之前都会
 * 先加载一个，但是这种方式的话就是很浪费内存的
 */
public class Singleton {

    private static  Singleton singleton = new Singleton();
    private  Singleton(){

    }

    public static  Singleton getInstance(){
        return  singleton;
    }


}
