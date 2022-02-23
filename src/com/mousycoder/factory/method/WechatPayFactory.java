package com.mousycoder.factory.method;

import com.mousycoder.factory.Pay;
import com.mousycoder.factory.WecatPay;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:38 AM
 */
public class WechatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WecatPay();
    }
}
