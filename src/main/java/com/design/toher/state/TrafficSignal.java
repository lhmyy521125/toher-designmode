package com.design.toher.state;

public class TrafficSignal {
    private State state;

    public TrafficSignal() {
        // 初始状态为红灯
        this.state = new RedLightState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void displaySignal() {
        state.displaySignal();
    }

    public void changeSignal() {
        System.out.println("开始切换============");
        state.handleSignalChange(this);
    }
}
