package com.design.toher.decorator;

public class BasicMakeup implements Makeup{
    @Override
    public void apply() {
        System.out.println("女朋友的原始妆容");
    }
}
