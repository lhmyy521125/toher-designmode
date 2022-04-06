package com.design.toher.factory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:14 下午
 * @Version 1.0
 */
//类方式
public class ServiceFactory3 {

    public IService create(Class<? extends IService> clazz) {
        try {
            if (clazz!=null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        ServiceFactory3 serviceFactory = new ServiceFactory3();
        IService services = serviceFactory.create(PullOilService.class);
        services.doSerice();
    }
}
