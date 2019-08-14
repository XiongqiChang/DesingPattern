package com.ccnu.singleton;

/**
 * 介绍的懒汉式的
 */
public class Singleton_02 {

    private  static  Singleton_02 singleton_02;
    private Singleton_02(){}

    /**
     * 这是最为简单的一种，首先是判断这个singleton_02这个值有没有的，然后
     * 进行判断的但是这样的话会导致线程不安全的。，因此我们可以对方法加上锁
     * @return
     */
    public static  synchronized  Singleton_02 getInstance() {
        if (singleton_02 == null)
            singleton_02 = new Singleton_02();

        return singleton_02;
    }
}
