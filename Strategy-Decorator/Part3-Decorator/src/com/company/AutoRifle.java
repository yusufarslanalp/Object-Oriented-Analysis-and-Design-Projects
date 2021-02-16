package com.company;

public class AutoRifle extends Accessory {
    Armored_suit suit;

    public AutoRifle(Armored_suit suit) {
        this.suit = suit;
    }


    @Override
    public String getDescription() {
        return suit.getDescription() + " + AutoRifle";
    }

    @Override
    public double cost() {
        return 30 + suit.cost();
    }

    @Override
    public double weight() {
        return 1.5 + suit.weight();
    }
}
