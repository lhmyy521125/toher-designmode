package com.design.toher.bridge;

public class AmericanCoffee extends Coffee {
    public AmericanCoffee(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void brew() {
        System.out.println("冲泡美式咖啡");
        additive.add();
    }
}