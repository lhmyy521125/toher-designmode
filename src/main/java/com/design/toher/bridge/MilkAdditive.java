package com.design.toher.bridge;

public class MilkAdditive implements CoffeeAdditive {
    @Override
    public void add() {
        System.out.println("添加牛奶");
    }
}