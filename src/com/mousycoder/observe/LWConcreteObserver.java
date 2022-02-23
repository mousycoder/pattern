package com.mousycoder.observe;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:02 AM
 */
public class LWConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("老王发现领导到来，暂停在线摸鱼，回归工作");
    }
}
