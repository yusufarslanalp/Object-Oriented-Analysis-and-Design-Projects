package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Complex_number {
    private double real;
    private double imaginary;


    public Complex_number(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        String result = "";

        result += df.format( real );
        result += " + i*";
        result += df.format( imaginary );
        //result += "\n";

        return result;
    }
}
