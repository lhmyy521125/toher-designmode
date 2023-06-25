package com.design.toher.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        //女朋友初始妆容
        Makeup makeup = new BasicMakeup();
        //底妆装饰
        makeup = new PrimerDecorator(makeup);
        //眼妆装饰
        makeup = new EyeMakeupDecorator(makeup);
        //唇妆装饰
        makeup = new LipMakeupDecorator(makeup);

        makeup.apply();
    }
}
