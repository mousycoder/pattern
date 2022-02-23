package com.mousycoder.facade;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:31 PM
 */
public class Main {

    public static void main(String[] args) {
        IMessageManager iMessageManager = new MessageFacade();
        iMessageManager.pushMessage();
    }
}
