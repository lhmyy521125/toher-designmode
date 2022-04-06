package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 5:32 下午
 * @Version 1.0
 */
//创建洗脚产品族中的具体工厂
public class FootbathFactory implements AbstractFactory {
    @Override
    public EarCleaning createEarCleaning() {
        return new FootbathEarCleaning();
    }

    @Override
    public FaceWashing createFaceWashing() {
        return new FootbathFaceWashing();
    }
}
