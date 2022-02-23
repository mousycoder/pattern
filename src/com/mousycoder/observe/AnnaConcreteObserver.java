package com.mousycoder.observe;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:04 AM
 */
public class AnnaConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Anna 发现老板，暂停摸鱼");
    }
}
