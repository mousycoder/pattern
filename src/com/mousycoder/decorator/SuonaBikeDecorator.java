package com.mousycoder.decorator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: 喇叭
 * @date 2022/2/21 8:01 PM
 */
public class SuonaBikeDecorator extends BikeDecorator{

    private String description = "增加一个喇叭";


    private Bike bike;

    public SuonaBikeDecorator(Bike bike){
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 50;
    }
}
