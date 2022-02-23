package com.mousycoder.template;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 10:28 AM
 */
public class UserServiceProjectManager extends AbstractProjectManager {
    @Override
    public void coding() {
        System.out.println("耗时10天");
    }

    @Override
    public void test() {
        System.out.println("功能测试，压力测试");
    }

    @Override
    public void online() {
        System.out.println("全量上线，灰度发布");
    }
}
