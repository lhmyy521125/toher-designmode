package com.design.toher.state;

public class StatePatternTest {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();

        // 显示当前信号灯状态
        signal.displaySignal();

        // 切换信号灯状态
        signal.changeSignal();

        // 显示切换后的信号灯状态
        signal.displaySignal();

        // 切换信号灯状态
        signal.changeSignal();

        // 显示切换后的信号灯状态
        signal.displaySignal();
    }
}
