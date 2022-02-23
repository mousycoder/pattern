package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:09 AM
 */
public class Main {
    public static void main(String[] args) {
        OrderFactory orderFactory = new WechatOrderFactory();
        orderFactory.createPay().unifiedorder();
        orderFactory.createRefund().refund();
    }
}
