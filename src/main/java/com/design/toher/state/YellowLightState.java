package com.design.toher.state;

public class YellowLightState implements State{
    @Override
    public void displaySignal() {
        System.out.println("黄灯亮起");
    }

    @Override
    public void handleSignalChange(TrafficSignal signal) {
        signal.setState(new RedLightState());
    }
}
