package com.design.toher.factory;

/**
 * @Author 李怀明
 * @Date 2022/4/1 9:14 下午
 * @Version 1.0
 */
public class ServiceFactory1 {
    public IService create(String name){
        //洗脚
        if(name.equals("footbath")){
            return new FootbathService();
        }
        //推油
        else if(name.equals("PullOil")){
            return new PullOilService();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        ServiceFactory1 serviceFactory = new ServiceFactory1();
        serviceFactory.create("footbath");
    }
}
