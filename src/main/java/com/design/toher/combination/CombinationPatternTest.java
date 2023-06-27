package com.design.toher.combination;

public class CombinationPatternTest {
    public static void main(String[] args) {
        // 创建菜单
        Menu menu = new Menu("餐厅菜单");

        // 创建菜单分类
        MenuCategory mainCourse = new MenuCategory("主菜");
        MenuCategory dessert = new MenuCategory("甜点");

        // 创建具体菜品
        Dish steak = new Dish("牛排", "美味的牛排", 50.0);
        Dish pasta = new Dish("意大利面", "经典的意式面食", 30.0);
        Dish cake = new Dish("蛋糕", "甜甜的蛋糕", 20.0);

        // 将菜品添加到相应的菜单分类中
        mainCourse.addComponent(steak);
        mainCourse.addComponent(pasta);
        dessert.addComponent(cake);

        // 将菜单分类添加到菜单中
        menu.addComponent(mainCourse);
        menu.addComponent(dessert);

        // 显示整个菜单
        menu.display();
    }
}
