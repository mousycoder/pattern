package com.mousycoder.single;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 10:59 PM
 */
public class SingletonHungry {

    public static final SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){

    }

    public static SingletonHungry getInstance(){
        return instance;
    }

    public void process(){
        System.out.println("方法调用成功");
    }
}
