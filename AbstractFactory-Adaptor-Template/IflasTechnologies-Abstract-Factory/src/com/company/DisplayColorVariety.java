package com.company;

public class DisplayColorVariety implements DisplayProperty {
    int bit;


    public DisplayColorVariety(int bit) {
        this.bit = bit;
    }

    @Override
    public String toString() {
        return Integer.toString( bit ) + "bit";
    }
}
