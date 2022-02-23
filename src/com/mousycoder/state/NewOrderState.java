package com.mousycoder.state;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:48 PM
 */
public class NewOrderState implements State{
    @Override
    public void handle() {
        System.out.println("新订单，未支付");
        System.out.println("调用商户客服服务，有新订单\n");

    }
}
