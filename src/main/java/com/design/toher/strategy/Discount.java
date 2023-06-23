package com.design.toher.strategy;

/**
 * 打折优惠策略
 */
public class Discount implements DiscountStrategy{
    private double discountPercentage;

    public Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double applyDiscount(double price) {
        return price * (1 - discountPercentage);
    }
}
