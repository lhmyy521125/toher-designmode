package com.design.toher.strategy;

/**
 * 定义女友 购物策略结算
 */
public class Girlfriend {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout(double totalPrice) {
        System.out.println("女友CPU飞速运转");
        return discountStrategy.applyDiscount(totalPrice);
    }
}
