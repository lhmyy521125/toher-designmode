package com.design.toher.factory.method;

import com.design.toher.factory.FootbathService;
import com.design.toher.factory.IService;

/**
 * @Author 李怀明
 * @Date 2022/4/1 11:13 下午
 * @Version 1.0
 */
//洗脚部长工厂类
public class FootbathFactory implements ServiceFactory {

    @Override
    public IService create() {
        return new FootbathService();
    }
}
