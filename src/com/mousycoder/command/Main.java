package com.mousycoder.command;

import java.util.concurrent.locks.Condition;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 1:57 PM
 */
public class Main {

    public static void main(String[] args) {
        ConditionReceiver receiver = new ConditionReceiver();
        Command onCommand = new OnCommand(receiver);
        Command offCommand = new OffCommand(receiver);
        Command coolCommand = new CoolCommand(receiver);
        Command warmCommand = new WarmCommand(receiver);

        AppInvoker appInvoker = new AppInvoker();
        appInvoker.setCoolCommand(coolCommand);
        appInvoker.setOnCommand(onCommand);
        appInvoker.setOffCommand(offCommand);
        appInvoker.setWarmCommand(warmCommand);

        appInvoker.on();
        appInvoker.off();
        appInvoker.warm();
        appInvoker.cool();

    }
}
