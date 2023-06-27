package com.design.toher.bridge;

public abstract class Coffee {
    protected CoffeeAdditive additive;

    public Coffee(CoffeeAdditive additive) {
        this.additive = additive;
    }

    public abstract void brew();
}