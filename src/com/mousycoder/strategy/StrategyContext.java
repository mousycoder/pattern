package com.mousycoder.strategy;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 9:43 AM
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStragegy(ProductOrder productOrder){
        return strategy.computePrice(productOrder);
    }




}
