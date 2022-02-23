package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:07 AM
 */
public class AliOrderFactory implements OrderFactory{
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
