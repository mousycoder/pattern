package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:03 AM
 */
public class WechatPay implements PayFactory{
    @Override
    public void unifiedorder() {
        System.out.println("WechatPay.unifiedorder");
    }

}
