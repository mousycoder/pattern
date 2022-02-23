package com.mousycoder.observe;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:01 AM
 */
public class BossConcreteSubject extends Subject{

    public void doSomething(){
        System.out.println("老板完成自己的工作");
        System.out.println("视察公司工作情况");
        super.notifyAllObserver();
    }
}
