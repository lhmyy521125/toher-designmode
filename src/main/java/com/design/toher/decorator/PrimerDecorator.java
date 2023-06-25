package com.design.toher.decorator;

/**
 * 底妆装饰者类
 */
public class PrimerDecorator extends MakeupDecorator {
    public PrimerDecorator(Makeup makeup) {
        super(makeup);
    }

    @Override
    public void apply() {
        super.apply();
        System.out.println("打底妆");
    }
}
