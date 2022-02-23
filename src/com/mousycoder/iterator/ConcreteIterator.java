package com.mousycoder.iterator;

import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 2:23 PM
 */
public class ConcreteIterator implements Iterator {

    private List list;

    private int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index == list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object remove(Object obj) {
        return list.remove(obj);
    }
}
