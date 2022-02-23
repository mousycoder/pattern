package com.mousycoder.single;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 10:37 PM
 */
public class SingletonLazy {

//    public static SingletonLazy instance;

    public void process(){
        System.out.println("instance = " + instance);
    }

    private SingletonLazy() {

    }

//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

//    public static synchronized SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }
    // DCL

    /**
     *
     * @return
     */
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            synchronized (SingletonLazy.class){
//                if (instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }


    public static volatile SingletonLazy instance;

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class){
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }





}
