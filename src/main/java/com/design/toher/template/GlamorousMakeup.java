package com.design.toher.template;

/**
 * 定义魅力妖艳妆
 */
public class GlamorousMakeup extends MakeupTemplate {
    @Override
    protected void washFace() {
        System.out.println("补水洗面奶清洁脸部");
    }

    @Override
    protected void applyFoundation() {
        System.out.println("涂抹厚厚的粉底");
    }

    @Override
    protected void doEyeMakeup() {
        System.out.println("涂抹浓密的眼影和眼线");
    }

    @Override
    protected void doBlushMakeup() {
        System.out.println("拍上艳丽的腮红");
    }

    @Override
    protected void applyLipstick() {
        System.out.println("涂抹鲜艳的口红");
    }
}
