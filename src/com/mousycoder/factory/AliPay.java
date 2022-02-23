package com.mousycoder.factory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:00 AM
 */
public class AliPay implements Pay{
    @Override
    public void unifiedorder() {
        System.out.println("统一下单 支付宝支付");
    }
}
