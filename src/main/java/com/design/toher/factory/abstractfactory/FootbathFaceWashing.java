package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 5:29 下午
 * @Version 1.0
 */
//扩展洗脚产品族的洁面类FootbathEarCleaning
public class FootbathFaceWashing implements FaceWashing {
    @Override
    public void washing() {
        System.out.println("洗脚产品族中的洁面产品等级");
    }
}
