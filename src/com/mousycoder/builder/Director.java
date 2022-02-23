package com.mousycoder.builder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 4:18 PM
 */
public class Director {

    public Computer create(Builder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildMainboard();
        builder.buildDisk();
        builder.buildPower();
        return builder.createComputer();
    }
}
