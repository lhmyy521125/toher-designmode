package com.design.toher.bridge;

public class SugarAdditive implements CoffeeAdditive {
    @Override
    public void add() {
        System.out.println("添加糖");
    }
}