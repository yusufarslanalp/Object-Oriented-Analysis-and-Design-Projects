package com.company;

public class Dec extends Armored_suit {
    public Dec() {
        description = "Dec";
    }

    @Override
    public double cost() {
        return 500;
    }

    @Override
    public double weight() {
        return 25;
    }
}
