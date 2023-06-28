package com.design.toher.command;

public class CommandPatternest {
    public static void main(String[] args) {
        // 创建设备对象
        Light livingRoomLight = new Light();

        // 创建命令对象
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // 创建遥控器
        RemoteController remoteController = new RemoteController();

        // 设置命令和按钮对应关系
        remoteController.setCommand("Button 1", lightOnCommand);
        remoteController.setCommand("Button 2", lightOffCommand);

        // 模拟按下按钮
        remoteController.pressButton("Button 1"); // Light On
        remoteController.pressButton("Button 2"); // Light Off
    }
}
