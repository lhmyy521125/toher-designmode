package com.design.toher.combination;

public class Dish implements MenuComponent {
    private String name;
    private String description;
    private double price;

    public Dish(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("菜品：" + name);
        System.out.println("描述：" + description);
        System.out.println("价格：" + price + "元");
    }
}