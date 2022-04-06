package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 1:30 上午
 * @Version 1.0
 */

//利用静态代码块的写法
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }

    //测试是否唯一 不会新new一个实例
    public static void main(String[] args) {
        System.out.println(HungryStaticSingleton.getInstance().hashCode());
        System.out.println(HungryStaticSingleton.getInstance().hashCode());
    }
}
