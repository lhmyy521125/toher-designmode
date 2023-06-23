package com.design.toher.strategy;

/**
 * 满减优惠策略
 */
public class FullReduction implements DiscountStrategy{

    //定义满减临界值
    private double threshold;
    //定义满减金额
    private double reductionAmount;

    public FullReduction(double threshold, double reductionAmount) {
        this.threshold = threshold;
        this.reductionAmount = reductionAmount;
    }

    @Override
    public double applyDiscount(double price) {
        if (price >= threshold) {
            return price - reductionAmount;
        } else {
            return price;
        }
    }
}
