package com.mousycoder.factory;

import com.mousycoder.factory.method.AliPayFactory;
import com.mousycoder.factory.method.PayFactory;
import com.mousycoder.factory.method.WechatPayFactory;
import com.mousycoder.factory.simple.SimplePayFactory;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:04 AM
 */
public class Main {

    public static void main(String[] args) {
//        Pay pay = SimplePayFactory.createPay("WECHAT_PAY");
//        pay.unifiedorder();

//        PayFactory payFactory = new AliPayFactory();
//        Pay pay = payFactory.getPay();
//        pay.unifiedorder();

        PayFactory payFactory = new WechatPayFactory();
        Pay pay = payFactory.getPay();
        pay.unifiedorder();

    }
}
