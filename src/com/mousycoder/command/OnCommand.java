package com.mousycoder.command;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 8:08 PM
 */
public class OnCommand implements Command {

    private ConditionReceiver receiver;

    public OnCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OnCommand -> execute");
        receiver.on();
    }
}
