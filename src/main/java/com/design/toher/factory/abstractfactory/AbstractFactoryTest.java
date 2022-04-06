package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 7:30 下午
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //洗脚产品族
        FootbathFactory footbathFactory = new FootbathFactory();
        footbathFactory.createEarCleaning().clean();
        footbathFactory.createFaceWashing().washing();

        //推油产品族
        PullOilFactory pullOilFactory = new PullOilFactory();
        pullOilFactory.createEarCleaning().clean();
        pullOilFactory.createFaceWashing().washing();
    }
}
