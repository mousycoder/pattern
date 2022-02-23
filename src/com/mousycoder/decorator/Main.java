package com.mousycoder.decorator;

import java.util.Arrays;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 8:05 PM
 */
public class Main {

    public static void main(String[] args) {
        Bike bike = new BigBike();

        bike = new RSCBikeDecorator(bike);
        bike = new RSCBikeDecorator(bike);

        bike = new SuonaBikeDecorator(bike);
        bike = new SuonaBikeDecorator(bike);

        System.out.println(bike.getDescription() + ", 价格：" + bike.getPrice());
    }
}
