package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 7:25 下午
 * @Version 1.0
 */
//扩展推油产品族的洁面类PullOilEarCleaning
public class PullOilFaceWashing implements FaceWashing {
    @Override
    public void washing() {
        System.out.println("推油产品族中的洁面产品等级");
    }
}
