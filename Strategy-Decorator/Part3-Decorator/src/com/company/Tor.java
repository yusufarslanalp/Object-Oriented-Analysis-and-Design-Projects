package com.company;

public class Tor extends Armored_suit {
    public Tor() {
        description = "Tor";
    }

    @Override
    public double cost() {
        return 5000;
    }

    @Override
    public double weight() {
        return 50;
    }
}
