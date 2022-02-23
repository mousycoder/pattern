package com.mousycoder.state;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:52 PM
 */
public class OrderContext {

    private State state;

    public OrderContext(State state) {
        this.state = state;
    }

    public OrderContext() {
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("订单状态变更");
        this.state.handle();
    }
}
