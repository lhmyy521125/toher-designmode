package com.design.toher.adapter;

/**
 * 电源适配器类
 */
public class PowerAdapter implements PowerSocket{
    private ChinesePowerSocket powerSocket;

    public PowerAdapter(ChinesePowerSocket powerSocket) {
        this.powerSocket = powerSocket;
    }
    @Override
    public void supplyPower() {
        System.out.println("通过适配器将电压转换为110V");
        powerSocket.supplyPower220V();
    }
}
