package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 5:25 下午
 * @Version 1.0
 */
//创建抽象工厂类AbstractFactory
public interface AbstractFactory {

    EarCleaning createEarCleaning();

    FaceWashing createFaceWashing();
}
