package com.mousycoder.facade;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:29 PM
 */
public class MessageFacade implements IMessageManager{

    private IMessageManager wechatMsgManager = new WechatMessageManager();

    private IMessageManager smsMsgManager = new SmsMessageManager();

    private IMessageManager mailMsgManager = new MailMessageManager();

    private IMessageManager dingdingMsgManager = new DingDingMessageManager();


    @Override
    public void pushMessage() {
        wechatMsgManager.pushMessage();
        smsMsgManager.pushMessage();
        mailMsgManager.pushMessage();
        dingdingMsgManager.pushMessage();
    }
}
