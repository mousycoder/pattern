package com.mousycoder.abstractfactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:59 AM
 */
public interface OrderFactory {

    PayFactory createPay();

    RefundFactory createRefund();

}
