package com.design.toher.factory.method;

import com.design.toher.factory.IService;
import com.design.toher.factory.PullOilService;

/**
 * @Author 李怀明
 * @Date 2022/4/1 11:13 下午
 * @Version 1.0
 */
//洗脚部长工厂类
public class PullOilFactory implements ServiceFactory {

    @Override
    public IService create() {
        //模拟需要VIP客户才能获得服务
        if(true){
            return new PullOilService();
        }
        return null;
    }
}
