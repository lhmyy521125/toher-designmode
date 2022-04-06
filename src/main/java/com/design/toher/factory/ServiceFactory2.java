package com.design.toher.factory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:14 下午
 * @Version 1.0
 */
//类名方式
public class ServiceFactory2 {

    public IService create(String className) {
        try {
            if (className != null && !className.equals("")) {
                return (IService) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        ServiceFactory2 serviceFactory = new ServiceFactory2();
        IService services = serviceFactory.create("com.design.toher.factory.FootbathService");
        services.doSerice();
    }
}
