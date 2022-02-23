package com.mousycoder.iterator;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 2:29 PM
 */
public interface ICollection {

    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();

}
