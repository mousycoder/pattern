package com.mousycoder.strategy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 9:46 AM
 */
public class NormalActivity extends Strategy{
    @Override
    public double computePrice(ProductOrder productOrder) {
        return productOrder.getOldPrice();
    }
}
