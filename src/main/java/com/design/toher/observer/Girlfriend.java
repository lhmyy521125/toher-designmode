package com.design.toher.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个主题类，表示你的女朋友
 *
 * @author micro
 */
public class Girlfriend {
    private List<Observer> observers = new ArrayList<>();
    private String expression;
    private String words;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMood(String expression, String words) {
        this.expression = expression;
        this.words = words;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(expression, words);
        }
    }
}
