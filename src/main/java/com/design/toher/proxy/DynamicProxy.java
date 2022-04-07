package com.design.toher.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 李怀明
 * @Date 2022/4/8 12:14 上午
 * @Version 1.0
 */
public class DynamicProxy implements InvocationHandler {
    //定义代理对象
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(
                //指定生产代理对象的类加载器
                clazz.getClassLoader(),
                //指定目标对象的实现接口
                clazz.getInterfaces(),
                this
                );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("婚介媒人已经和委托人建立了关系");
        System.out.println("婚介媒人开始物色女孩");
        Object object = method.invoke(this.target, args);
        System.out.println("如果双方合适同意交往");
        return object;
    }

    //开始测试 还是张先生 以及新增的老王
    public static void main(String[] args) {
        Person mrZhang = (Person)new DynamicProxy().getInstance(new MrZhang());
        mrZhang.findGirlFriend();
        System.out.println();
        Person mrWang = (Person)new DynamicProxy().getInstance(new MrWang());
        mrWang.findGirlFriend();
    }
}
