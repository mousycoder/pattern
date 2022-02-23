package com.mousycoder.facade;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:26 PM
 */
public class DingDingMessageManager implements IMessageManager{
    @Override
    public void pushMessage() {
        System.out.println("推送dingding消息");
    }
}
