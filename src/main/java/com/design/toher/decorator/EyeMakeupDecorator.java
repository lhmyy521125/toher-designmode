package com.design.toher.decorator;

/**
 * 眼妆装饰者类
 * @author micro
 */
public class EyeMakeupDecorator extends MakeupDecorator {
    public EyeMakeupDecorator(Makeup makeup) {
        super(makeup);
    }

    @Override
    public void apply() {
        super.apply();
        System.out.println("眼妆");
    }
}
