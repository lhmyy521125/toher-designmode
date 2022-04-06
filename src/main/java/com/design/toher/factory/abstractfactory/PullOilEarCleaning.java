package com.design.toher.factory.abstractfactory;

/**
 * @Author 李怀明
 * @Date 2022/4/6 5:29 下午
 * @Version 1.0
 */
//扩展推油产品族的采耳类PullOilEarCleaning
public class PullOilEarCleaning implements EarCleaning {
    @Override
    public void clean() {
        System.out.println("推油产品族中的采耳产品等级");
    }
}
