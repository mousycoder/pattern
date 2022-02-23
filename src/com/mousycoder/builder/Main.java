package com.mousycoder.builder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 4:23 PM
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Computer lowComputer = director.create(new LowComputerBuilder());
        System.out.println("lowComputer = " + lowComputer);
        Computer highComputer = director.create(new HighComputerBuilder());
        System.out.println("highComputer = " + highComputer);
    }
}
