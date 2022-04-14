package com.design.toher.prototype.deepclone;

import com.design.toher.prototype.shallowclone.ConcretePrototype;

import java.util.Arrays;

/**
 * @Author 李怀明
 * @Date 2022/4/14 1:38 上午
 * @Version 1.0
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course();
        course.setCourseName("JAVA");
        course.setVideo(new Video());
        try{
            Course clone = (Course)course.clone();
            System.out.println("深克隆内存地址是否相同："+(course.video == clone.video));
        } catch (Exception e){
            e.printStackTrace();
        }

        Course q = new Course();
        Course n = q.shallowClone(q);
        System.out.println("浅克隆内存地址是否相同："+(q.video == n.video));
    }
}
