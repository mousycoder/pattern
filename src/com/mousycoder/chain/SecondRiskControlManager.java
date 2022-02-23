package com.mousycoder.chain;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:57 AM
 */
public class SecondRiskControlManager extends RiskControlManager{


    public SecondRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getRequestType()) != null && request.getMoney() > 1000 && request.getMoney() < 10000) {
            System.out.println("稍微大额操作，输入支付密码 + 短信验证码");
            System.out.println(name + ":" + request.getRequestType() + ", 金额 :" + request.getMoney() + "处理完成");
        } else {
            if (superior != null) {
                superior.handlerRequest(request);
            }
        }
    }
}
