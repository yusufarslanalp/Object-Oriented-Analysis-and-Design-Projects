package com.company;

public class Flamethrower extends Accessory {
    Armored_suit suit;

    public Flamethrower(Armored_suit suit) {
        this.suit = suit;
    }

    @Override
    public String getDescription() {
        return  suit.getDescription() + " + Flamethrower";
    }

    @Override
    public double cost() {
        return 50 + suit.cost();
    }

    @Override
    public double weight() {
        return 2 + suit.weight();
    }
}
