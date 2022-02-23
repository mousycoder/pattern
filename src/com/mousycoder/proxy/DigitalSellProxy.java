package com.mousycoder.proxy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:08 PM
 */
public class DigitalSellProxy implements DigitalSell{

    private DigitalSell realObj = new DigitalSellReal();


    @Override
    public void sell() {
        makeAddress();
        realObj.sell();
        makeAD();
    }


    private void makeAddress(){
        System.out.println("一个人流量很高的地址");
    }

    private void makeAD(){
        System.out.println("投放广告");
    }
}
