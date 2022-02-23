package com.mousycoder.adapter.api;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 5:10 PM
 */
public class ProductVideoOrder extends PayGatewayAdapter{

    @Override
    public void unifieorder() {
        System.out.println("ProductVideoOrder.unifieorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoOrder.refund");
    }
}
