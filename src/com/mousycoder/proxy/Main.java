package com.mousycoder.proxy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:12 PM
 */
public class Main {

    public static void main(String[] args) {
        DigitalSell realObj = new DigitalSellReal();
        realObj.sell();

        DigitalSell proxy = new DigitalSellProxy();
        proxy.sell();

    }
}
