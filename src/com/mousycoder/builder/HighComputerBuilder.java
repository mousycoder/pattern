package com.mousycoder.builder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 4:15 PM
 */
public class HighComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("高配 CPU");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("高配主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
