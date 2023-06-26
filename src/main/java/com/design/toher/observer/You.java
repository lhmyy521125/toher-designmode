package com.design.toher.observer;

/**
 * 定义具体观察者类，表示你
 * @author micro
 */
public class You implements Observer {
    private String name;

    public You(String name) {
        this.name = name;
    }

    //举例根据女友言语做出的反应
    public void doSomething(String words){
        if(words.equals("太贵了我不想要")){
            System.out.println(name + "做出反应: 赶紧给她买");
        }
        if(words.equals("怎么可能是你的错，都是我的错！")){
            System.out.println(name + "做出反应: 赶紧给道歉");
        }
    }

    @Override
    public void update(String expression, String words) {
        System.out.println(name + "观察到: 她的表情是" + expression + "，她说：" + words);
        doSomething(words);
    }
}
