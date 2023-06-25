package com.design.toher.template;

/**
 * 定义自然妆
 * @author mac
 */
public class NaturalMakeup extends MakeupTemplate {
    @Override
    protected void washFace() {
        System.out.println("美白洗面奶清洁脸部");
    }

    @Override
    protected void applyFoundation() {
        System.out.println("涂抹轻薄的粉底");
    }

    @Override
    protected void doEyeMakeup() {
        System.out.println("涂抹淡雅的眼影和睫毛膏");
    }

    @Override
    protected void doBlushMakeup() {
        System.out.println("拍上淡粉的腮红");
    }

    @Override
    protected void applyLipstick() {
        System.out.println("涂抹自然色调的口红");
    }
}
