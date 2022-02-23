package com.mousycoder.state;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:49 PM
 */
public class SendOrderState implements State{
    @Override
    public void handle() {
        System.out.println("订单已发货");
        System.out.println("调用短信服务，订单已经发货");
        System.out.println("更新物流服务,已发货\n");


    }
}
