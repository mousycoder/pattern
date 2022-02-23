package com.mousycoder.factory.method;

import com.mousycoder.factory.AliPay;
import com.mousycoder.factory.Pay;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:36 AM
 */
public class AliPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
