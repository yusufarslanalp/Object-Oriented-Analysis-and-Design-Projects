package com.company;

public class DisplaySize implements DisplayProperty {
    double size;


    public DisplaySize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return Double.toString( size ) + "inches";
    }
}
