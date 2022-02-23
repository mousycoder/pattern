package com.mousycoder.factory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:00 AM
 */
public class WecatPay implements Pay{
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单");
    }
}
