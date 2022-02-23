package com.mousycoder.adapter.cls;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 5:37 PM
 */
public class Adapter extends OldModule implements TargetModule{
    @Override
    public void methodB() {
        System.out.println("Adapter.methodB");
    }
}
