package com.design.toher.factory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:18 下午
 * @Version 1.0
 */
public class PullOilService implements IService {
    @Override
    public void doSerice() {
        System.out.println("正在提供推油服务");
    }
}
