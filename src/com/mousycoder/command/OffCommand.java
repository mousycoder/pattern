package com.mousycoder.command;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 8:08 PM
 */
public class OffCommand implements Command {

    private ConditionReceiver receiver;

    public OffCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OffCommand -> execute");
        receiver.off();
    }
}
