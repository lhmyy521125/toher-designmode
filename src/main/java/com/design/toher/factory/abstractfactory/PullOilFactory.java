package com.design.toher.factory.abstractfactory;

import com.design.toher.factory.IService;
import com.design.toher.factory.PullOilService;
import com.design.toher.factory.method.ServiceFactory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 11:13 下午
 * @Version 1.0
 */
public class PullOilFactory implements AbstractFactory {

    @Override
    public EarCleaning createEarCleaning() {
        return new PullOilEarCleaning() ;
    }

    @Override
    public FaceWashing createFaceWashing() {
        return new PullOilFaceWashing();
    }
}
