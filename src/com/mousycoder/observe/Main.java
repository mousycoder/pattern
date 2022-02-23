package com.mousycoder.observe;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:04 AM
 */
public class Main {

    public static void main(String[] args) {
        BossConcreteSubject subject = new BossConcreteSubject();

        LWConcreteObserver observer1 = new LWConcreteObserver();

        AnnaConcreteObserver observer2 = new AnnaConcreteObserver();

        subject.addObserver(observer1);
//        subject.addObserver(observer2);

        subject.doSomething();

    }
}
