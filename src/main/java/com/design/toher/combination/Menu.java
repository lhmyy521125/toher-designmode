package com.design.toher.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> components;

    public Menu(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(MenuComponent component) {
        components.add(component);
    }

    public void removeComponent(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("菜单：" + name);
        System.out.println("--------------------");
        for (MenuComponent component : components) {
            component.display();
            System.out.println();
        }
    }
}
