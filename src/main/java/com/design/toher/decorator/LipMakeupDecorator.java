package com.design.toher.decorator;

/**
 * 唇妆装饰者类
 * @author mac
 */
public class LipMakeupDecorator extends MakeupDecorator {
    public LipMakeupDecorator(Makeup makeup) {
        super(makeup);
    }

    @Override
    public void apply() {
        super.apply();
        System.out.println("唇妆");
    }
}
