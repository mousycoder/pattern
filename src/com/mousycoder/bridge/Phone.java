package com.mousycoder.bridge;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 6:12 PM
 */
public abstract class Phone {

    //通过组合的方式来桥接其他行为
    protected Color color;

    abstract public void run();

    public void setColor(Color color) {
        this.color = color;
    }
}
