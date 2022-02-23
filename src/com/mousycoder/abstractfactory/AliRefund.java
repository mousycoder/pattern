package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:05 AM
 */
public class AliRefund implements RefundFactory{
    @Override
    public void refund() {
        System.out.println("AliRefund.refund");
    }
}
