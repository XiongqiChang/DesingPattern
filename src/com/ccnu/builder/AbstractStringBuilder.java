package com.ccnu.builder;

import java.util.Arrays;

//定义一个抽象的StringBuilder
public abstract class AbstractStringBuilder {
    //定义一个数组
    protected  char[] value;
    //定义数组内的个数
    protected int count;

    //构造方法
    public  AbstractStringBuilder(int capacity){
        count = 0;
        value = new char[capacity];
    }

    //添加元素的方法
    public AbstractStringBuilder append(char c){
        //保证扩容机制
        ensureCapacityInteral(count + 1);
        value[count++] = c;
        return  this;
    }

    private  void ensureCapacityInteral(int miniumCapacity){

        //这里就是判断如果不需要扩容的话，应该是等于0的
        if(miniumCapacity - value.length > 0){
            //进行扩容
            expandCapacity(miniumCapacity);
        }
    }

    protected  void expandCapacity(int miniumCapacity){
        int newCapacity = value.length * 2 + 2;
        if(newCapacity - miniumCapacity < 0)
            newCapacity = miniumCapacity;
        if(newCapacity < 0){
            if(miniumCapacity < 0)
                throw new OutOfMemoryError();
            newCapacity = Integer.MAX_VALUE;
        }
        //Arrays的方法可以复制一个新的数组的长度
        value = Arrays.copyOf(value,newCapacity);
    }

}
