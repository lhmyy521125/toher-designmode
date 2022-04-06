package com.design.toher.factory.method;

import com.design.toher.factory.IService;
import com.design.toher.factory.ServiceFactory2;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:24 下午
 * @Version 1.0
 */
public class ServiceFactoryTest {
    public static void main(String[] args) {
        //洗脚
        ServiceFactory serviceFactory = new FootbathFactory();
        IService iService = serviceFactory.create();
        iService.doSerice();

        //推油
        serviceFactory = new PullOilFactory();
        iService = serviceFactory.create();
        iService.doSerice();
    }
}
