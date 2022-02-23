package com.mousycoder.strategy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 9:49 AM
 */
public class VoucherActivity extends Strategy{

    private double voucher;

    public VoucherActivity(double voucher) {
        this.voucher = voucher;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {

        if (productOrder.getOldPrice() > voucher) {
            return productOrder.getOldPrice() - voucher;
        }else {
            return 0;
        }
    }
}
