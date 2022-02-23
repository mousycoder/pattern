package com.mousycoder.builder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: 声明了建造者的公共方法
 * @date 2022/2/21 4:13 PM
 */
public interface Builder {

    void buildCpu();

    void buildMainboard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();

}
