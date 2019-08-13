package com.ccnu.singleton;

/**
 * 还有一种实现一个静态的内部类，这种方式都是线程安全的，并且的话是更加简单的高效的
 */
public class Singleton_04 {

    private Singleton_04(){}

    private static  class  SingletonHolder{
        private static Singleton_04 singleton_04 = new Singleton_04();
    }

    public static  Singleton_04 getInstance(){
        return  SingletonHolder.singleton_04;
    }
}
