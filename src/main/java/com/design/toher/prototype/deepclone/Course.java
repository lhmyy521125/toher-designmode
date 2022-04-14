package com.design.toher.prototype.deepclone;

import com.design.toher.prototype.shallowclone.ConcretePrototype;

import java.io.*;

/**
 * @Author 李怀明
 * @Date 2022/4/14 2:13 上午
 * @Version 1.0
 */
public class Course implements Cloneable, Serializable {
    public String courseName;
    public Video video;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return this.deepClone();
    }

    public Object deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis =  new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Course copy = (Course)ois.readObject();
            return copy;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Course shallowClone(Course target) {
        Course course = new Course();
        course.video = target.video;
        course.courseName = target.courseName;
        return course;
    }
}
