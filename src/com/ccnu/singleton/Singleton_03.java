package com.ccnu.singleton;

/**
 * 通过之前的过程我们知道对于懒汉式直接在方法上面加锁的话，我们会导致的效率变低了
 * 我们可以采用的是双重锁机制对其进行加锁
 */
public class Singleton_03 {

    //这里注意的是我们采用volatilt的关键字对其进行修饰，这样的话就是可以保证线程安全的，不会发生重排序的过程的
    private  static  volatile  Singleton_03 singleton_03;
    private   Singleton_03(){}
    public static Singleton_03 getInstance(){
        //这个是第一轮的判断，得出的是当前是不是为空的，这样就为了一次就锁上了，导致了效率很低
        if (singleton_03 == null){
            //对其进行加锁，锁上当前的对象
            synchronized (Singleton_03.class){
                //再次进行判断此时singleton_03的值是不是为空的
                if(singleton_03 == null){
                    singleton_03 = new Singleton_03();
                }
            }
        }
        return  singleton_03;
    }
}
