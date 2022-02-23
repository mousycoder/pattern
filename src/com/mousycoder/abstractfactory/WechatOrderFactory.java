package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:08 AM
 */
public class WechatOrderFactory implements OrderFactory{
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WechatRefund();
    }
}
