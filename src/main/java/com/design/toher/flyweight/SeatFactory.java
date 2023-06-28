package com.design.toher.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SeatFactory {
    private static Map<String, Seat> seatMap = new HashMap<>();

    public static Seat getSeat(int row, int column) {
        String key = row + "-" + column;

        if (seatMap.containsKey(key)) {
            return seatMap.get(key);
        } else {
            Seat seat = new Seat(row, column);
            seatMap.put(key, seat);
            return seat;
        }
    }

    public static void clearSeats() {
        seatMap.clear();
    }
}
