package com.design.toher.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {

        Girlfriend cart = new Girlfriend();
        // 使用打折优惠策略
        DiscountStrategy discountStrategy = new Discount(0.2);
        cart.setDiscountStrategy(discountStrategy);
        double totalPrice = 100.0;
        double finalPrice = cart.checkout(totalPrice);
        System.out.println("使用打折优惠后的价格：" + finalPrice);

        // 使用满减优惠策略
        DiscountStrategy fullReductionStrategy = new FullReduction(200.0, 50.0);
        cart.setDiscountStrategy(fullReductionStrategy);
        totalPrice = 250.0;
        finalPrice = cart.checkout(totalPrice);
        System.out.println("使用满减优惠后的价格：" + finalPrice);
    }
}
