package com.design.toher.bridge;

public class LatteCoffee extends Coffee {
    public LatteCoffee(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void brew() {
        System.out.println("冲泡拿铁咖啡");
        additive.add();
    }
}
