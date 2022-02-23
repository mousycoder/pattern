package com.mousycoder.decorator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: 防爆胎
 * @date 2022/2/21 8:01 PM
 */
public class RSCBikeDecorator extends BikeDecorator{

    private String description = "增加一个防爆胎";


    private Bike bike;

    public RSCBikeDecorator(Bike bike){
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 100;
    }
}
