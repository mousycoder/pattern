package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:02 AM
 */
public class AliPay implements PayFactory{
    @Override
    public void unifiedorder() {
        System.out.println("AliPay.unifiedorder");
    }

}
