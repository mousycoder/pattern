package com.mousycoder.adapter.api;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 5:08 PM
 */
public interface PayGateway {

    void unifieorder();

    void refund();

    void query();

    void sendRedPack();
}
