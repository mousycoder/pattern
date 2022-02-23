package com.mousycoder.strategy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 9:47 AM
 */
public class DiscountActivity extends Strategy{

    private double rate;

    public DiscountActivity(double rate) {
        this.rate = rate;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {
        return productOrder.getOldPrice() * rate;
    }
}
