package com.mousycoder.decorator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 7:56 PM
 */
public class BigBike implements Bike {

    private String description = "大号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
