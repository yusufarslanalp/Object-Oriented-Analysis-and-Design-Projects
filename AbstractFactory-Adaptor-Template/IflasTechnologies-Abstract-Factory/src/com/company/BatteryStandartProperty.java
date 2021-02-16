package com.company;

public class BatteryStandartProperty implements BatteryProperty {
    int hour;
    int capacity;


    public BatteryStandartProperty(int hour, int capacity) {
        this.hour = hour;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String result = "";
        result = Integer.toString( hour ) + "h " + Integer.toString( capacity ) + "mAh ";
        return result;
    }
}
