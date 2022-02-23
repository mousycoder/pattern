package com.mousycoder.chain;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 12:06 PM
 */
public class Main {

    public static void main(String[] args) {
        RiskControlManager firstControllerManager = new FirstRiskControlManager("初级风控");
        RiskControlManager secondControllerManager = new SecondRiskControlManager("中级风控");
        RiskControlManager thirdControllerManager = new ThirdRiskControlManager("高级风控");

        firstControllerManager.setSuperior(secondControllerManager);
        secondControllerManager.setSuperior(thirdControllerManager);

        Request request1 = new Request();
        request1.setRequestType(RequestType.TRANSFER.name());
        request1.setMoney(1200);

        firstControllerManager.handlerRequest(request1);

    }
}
