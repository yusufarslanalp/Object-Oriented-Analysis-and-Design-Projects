package com.company;

public class Ora extends Armored_suit {
    public Ora() {
        description = "Ora";
    }

    @Override
    public double cost() {
        return 1500;
    }

    @Override
    public double weight() {
        return 30;
    }
}
