package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:05 AM
 */
public class WechatRefund implements RefundFactory{
    @Override
    public void refund() {
        System.out.println("WechatRefund.refund");
    }
}
