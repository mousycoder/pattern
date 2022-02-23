package com.mousycoder.state;

import java.lang.reflect.Proxy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:54 PM
 */
public class Main {

    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.setState(new NewOrderState());
        context.setState(new PayOrderState());
        context.setState(new SendOrderState());
    }
}
