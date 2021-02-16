package com.company;

public class FrecuencySize implements CPU_RamProperty {
    double frecuency;
    double ram_size;


    public FrecuencySize(double frecuency, double ream_size) {
        this.frecuency = frecuency;
        this.ram_size = ream_size;
    }

    @Override
    public String toString() {
        String result = "";
        result += Double.toString( frecuency ) + "Ghz ";
        result += Double.toString( ram_size ) + "GB ";
        return result;
    }
}
