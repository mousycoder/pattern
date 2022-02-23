package com.mousycoder.bridge;

/**
 * @author mousycoder
 * @version 1.0
 * @description: 手机的实例化
 * @date 2022/2/21 6:15 PM
 */
public class HWPhone extends Phone{

    public HWPhone(Color color){
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("华为手机");
    }
}
