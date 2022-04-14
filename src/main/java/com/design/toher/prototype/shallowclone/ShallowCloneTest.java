package com.design.toher.prototype.shallowclone;

import java.util.Arrays;

/**
 * @Author 李怀明
 * @Date 2022/4/14 1:38 上午
 * @Version 1.0
 */
public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype obj1 = new ConcretePrototype();
        obj1.setAge(18);
        obj1.setHobbys(Arrays.asList("打球","洗脚"));
        ConcretePrototype obj2 = (ConcretePrototype) obj1.clone();
        System.out.println("克隆对象obj1中引用类型地址值：" + obj1.getHobbys());
        System.out.println("克隆对象obj2中引用类型地址值：" + obj2.getHobbys());
        System.out.println("对象地址比较：" + (obj1.getHobbys() == obj2.getHobbys()));
    }
}
