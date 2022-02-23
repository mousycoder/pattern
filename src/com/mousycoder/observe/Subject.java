package com.mousycoder.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 10:53 AM
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();


    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : this.observerList) {
            observer.update();
        }
    }

}
