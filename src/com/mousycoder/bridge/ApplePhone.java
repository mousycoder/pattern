package com.mousycoder.bridge;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 6:15 PM
 */
public class ApplePhone extends Phone{

    public ApplePhone(Color color){
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("苹果手机");
    }
}
