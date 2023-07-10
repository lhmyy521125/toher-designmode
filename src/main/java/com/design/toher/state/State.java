package com.design.toher.state;

public interface State {
    void displaySignal();
    void handleSignalChange(TrafficSignal signal);
}
