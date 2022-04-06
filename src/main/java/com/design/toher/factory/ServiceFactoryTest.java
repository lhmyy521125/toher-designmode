package com.design.toher.factory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:24 下午
 * @Version 1.0
 */
public class ServiceFactoryTest {
    public static void main(String[] args) {
        ServiceFactory2 serviceFactory = new ServiceFactory2();
        serviceFactory.create("footbath");
    }
}
