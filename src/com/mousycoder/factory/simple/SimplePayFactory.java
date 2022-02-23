package com.mousycoder.factory.simple;

import com.mousycoder.factory.AliPay;
import com.mousycoder.factory.Pay;
import com.mousycoder.factory.WecatPay;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:02 AM
 */
public class SimplePayFactory {

    /**
     *
     * @param payType
     * @return
     */
    public static Pay createPay(String payType){
       if (payType == null){
           return null;
       }

       if (payType.equalsIgnoreCase("WECHAT_PAY")){
           return new WecatPay();
       }else if(payType.equalsIgnoreCase("ALI_PAY")){
           return new AliPay();
       }
       return null;
    }
}
