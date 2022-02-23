package com.mousycoder.adapter.api;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 5:10 PM
 */
public class ProductVipOrder extends PayGatewayAdapter {
    @Override
    public void unifieorder() {
        System.out.println("ProductVipOrder.unifieorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVipOrder.refund");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVipOrder.sendRedPack");
    }
}
