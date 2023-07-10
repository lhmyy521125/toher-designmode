package com.design.toher.state;

public class RedLightState implements State{
    @Override
    public void displaySignal() {
        System.out.println("红灯亮起");
    }

    @Override
    public void handleSignalChange(TrafficSignal signal) {
        signal.setState(new GreenLightState());
    }
}
