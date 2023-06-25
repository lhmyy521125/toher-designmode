package com.design.toher.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        ChinesePowerSocket chinesePowerSocket = new ChinesePowerSocket();
        PowerAdapter powerAdapter = new PowerAdapter(chinesePowerSocket);
        powerAdapter.supplyPower();
    }
}
