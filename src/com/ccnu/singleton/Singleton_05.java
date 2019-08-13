package com.ccnu.singleton;

/**
 * 这种方式就是采用的是枚举
 */
public enum Singleton_05 {
    INSTANCE;

    public  static  Singleton_05 getInstance(){
        return  INSTANCE;
    }
}
