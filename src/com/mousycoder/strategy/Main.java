package com.mousycoder.strategy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 9:46 AM
 */
public class Main {

    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder(1, 1, 1);
        StrategyContext context = new StrategyContext(new DiscountActivity(0.8));
        double price = context.executeStragegy(productOrder);
        System.out.println("price = " + price);

        context = new StrategyContext(new NormalActivity());
        price = context.executeStragegy(productOrder);
        System.out.println("price = " + price);

        context = new StrategyContext(new DiscountActivity(0.7));
        price = context.executeStragegy(productOrder);
        System.out.println("price = " + price);


    }
}
