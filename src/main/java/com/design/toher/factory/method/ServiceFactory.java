package com.design.toher.factory.method;

import com.design.toher.factory.FootbathService;
import com.design.toher.factory.IService;
import com.design.toher.factory.PullOilService;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:14 下午
 * @Version 1.0
 */
public interface ServiceFactory {
    IService create();
}
