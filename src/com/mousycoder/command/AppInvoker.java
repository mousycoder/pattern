package com.mousycoder.command;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 1:55 PM
 */
public class AppInvoker {

    private Command onCommand;

    private Command offCommand;

    private Command coolCommand;

    private Command warmCommand;


    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setCoolCommand(Command coolCommand) {
        this.coolCommand = coolCommand;
    }

    public void setWarmCommand(Command warmCommand) {
        this.warmCommand = warmCommand;
    }


    public void on() {
        onCommand.execute();
    }

    public void off() {
        offCommand.execute();
    }

    public void warm() {
        warmCommand.execute();
    }

    public void cool() {
        coolCommand.execute();
    }


}
