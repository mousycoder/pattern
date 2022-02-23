package com.mousycoder.state;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:49 PM
 */
public class PayOrderState implements State{
    @Override
    public void handle() {
        System.out.println("订单已支付");
        System.out.println("调用商户客服服务，订单已经支付");
        System.out.println("调用物流服务,未发货\n");


    }
}
