package com.mousycoder.decorator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 7:59 PM
 */
public class BikeDecorator implements Bike{

    private String description = "我只是装饰器";

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
