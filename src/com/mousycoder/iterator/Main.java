package com.mousycoder.iterator;

import java.util.ArrayList;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 2:34 PM
 */
public class Main {

    public static void main(String[] args) {
        ICollection collection = new MyCollection();
        collection.add("1111");
        collection.add("2222");
        collection.add("3333");
        collection.add("4444");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
