package com.mousycoder.proxy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:06 PM
 */
public class DigitalSellReal implements DigitalSell{
    @Override
    public void sell() {
        System.out.println("销售华为手机");
    }
}
