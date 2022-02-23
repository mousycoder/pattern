package com.mousycoder.bridge;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 6:21 PM
 */
public class Main {
    public static void main(String[] args) {
        HWPhone blueHwPhone = new HWPhone(new BlueColor());
        blueHwPhone.run();

        HWPhone redHwPhone = new HWPhone(new RedColor());
        redHwPhone.run();

        ApplePhone blueApplePhone = new ApplePhone(new BlueColor());
        blueApplePhone.run();

    }
}
