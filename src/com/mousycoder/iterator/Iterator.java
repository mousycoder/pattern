package com.mousycoder.iterator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 2:22 PM
 */
public interface Iterator {

    Object next();

    boolean hasNext();

    Object remove(Object obj);
}
