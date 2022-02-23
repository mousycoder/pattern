package com.mousycoder.template;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 10:22 AM
 */
public abstract class AbstractProjectManager {

    public final void processProject() {
        review();
        design();
        coding();
        test();
        online();
    }

    private void review() {
        System.out.println("项目需求评审");
    }

    private void design() {
        System.out.println("UI UE 进行设计");
    }

    protected abstract void coding();

    protected abstract void test();

    protected abstract void online();


}
