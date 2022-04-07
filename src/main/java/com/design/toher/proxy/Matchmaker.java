package com.design.toher.proxy;

/**
 * @Author 李怀明
 * @Date 2022/4/7 11:43 下午
 * @Version 1.0
 * 婚介媒人帮张先生找女朋友
 */
public class Matchmaker {
    private MrZhang mrZhang;

    public Matchmaker(MrZhang mrZhang){
        this.mrZhang = mrZhang;
    }
    //目标对象的引用
    public void findGirl(){
        System.out.println("婚介媒人开始物色女孩");
        System.out.println("婚介媒人开始对张先生增强：张先生高富帅，值得交往！");
        this.mrZhang.findGirlFriend();
        System.out.println("双方确立关系，开始没羞没躁的生活");
    }


    //测试代码
    public static void main(String[] args) {
        Matchmaker matchmaker = new Matchmaker(new MrZhang());
        matchmaker.findGirl();
    }
}
