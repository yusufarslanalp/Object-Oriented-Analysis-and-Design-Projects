package com.company;

public class Laser extends Accessory {
    Armored_suit suit;

    public Laser(Armored_suit suit) {
        this.suit = suit;
    }

    @Override
    public String getDescription() {
        return suit.getDescription() + " + Laser";
    }

    @Override
    public double cost() {
        return 200 + suit.cost();
    }

    @Override
    public double weight() {
        return 5.5 + suit.weight();
    }
}
