package com.design.toher.prototype.shallowclone;

import java.util.List;

/**
 * @Author 李怀明
 * @Date 2022/4/14 1:32 上午
 * @Version 1.0
 */
public class ConcretePrototype implements Cloneable {
    //基本类型属性
    private int age;
    //非基本类型属性
    private List hobbys;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbys() {
        return hobbys;
    }

    public void setHobbys(List hobbys) {
        this.hobbys = hobbys;
    }

    ConcretePrototype(){
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (ConcretePrototype) super.clone();
    }
}
