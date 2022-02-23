package com.mousycoder.bridge;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 6:15 PM
 */
public class SXPhone extends Phone{

    public SXPhone(Color color){
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("三星手机");
    }
}
