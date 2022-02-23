package com.mousycoder.builder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 4:15 PM
 */
public class LowComputerBuilder implements Builder{

    private Computer computer = new Computer();



    @Override
    public void buildCpu() {
        computer.setCpu("低配 CPU");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("低配主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("低配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("低配电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("低配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
