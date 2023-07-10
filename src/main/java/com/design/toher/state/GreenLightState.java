package com.design.toher.state;

public class GreenLightState implements State{
    @Override
    public void displaySignal() {
        System.out.println("绿灯亮起");
    }

    @Override
    public void handleSignalChange(TrafficSignal signal) {
        signal.setState(new YellowLightState());
    }
}
