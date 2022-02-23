package com.mousycoder.command;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 8:06 PM
 */
public class ConditionReceiver {

    public void on(){
        System.out.println("空调开启了");
    }

    public void off(){
        System.out.println("空调关闭了");
    }

    public void cool(){
        System.out.println("空调开始制冷");
    }

    public void warm(){
        System.out.println("空调开始制热");
    }
}
