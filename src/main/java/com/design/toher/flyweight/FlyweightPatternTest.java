package com.design.toher.flyweight;

public class FlyweightPatternTest {
    public static void main(String[] args) {
        // 生成座位并显示座位信息
        Seat seat1 = SeatFactory.getSeat(1, 1);
        Seat seat2 = SeatFactory.getSeat(1, 2);
        Seat seat3 = SeatFactory.getSeat(2, 1);
        Seat seat4 = SeatFactory.getSeat(2, 2);

        System.out.println(seat1.getRow() + "-" + seat1.getColumn());
        System.out.println(seat2.getRow() + "-" + seat2.getColumn());
        System.out.println(seat3.getRow() + "-" + seat3.getColumn());
        System.out.println(seat4.getRow() + "-" + seat4.getColumn());

        // 从工厂获取座位对象
        Seat seat5 = SeatFactory.getSeat(1, 1);
        Seat seat6 = SeatFactory.getSeat(1, 2);

        System.out.println(seat5.getRow() + "-" + seat5.getColumn());
        System.out.println(seat6.getRow() + "-" + seat6.getColumn());

        // 清理座位工厂
        SeatFactory.clearSeats();
    }
}
