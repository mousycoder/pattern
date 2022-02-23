package com.mousycoder.chain;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:57 AM
 */
public class FirstRiskControlManager extends RiskControlManager {


    public FirstRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getRequestType()) != null && request.getMoney() <= 1000) {
            System.out.println("普通操作，输入支付密码即可");
            System.out.println(name + ":" + request.getRequestType() + ", 金额 :" + request.getMoney() + "处理完成");
        } else {
            if (superior != null) {
                superior.handlerRequest(request);
            }
        }
    }
}
