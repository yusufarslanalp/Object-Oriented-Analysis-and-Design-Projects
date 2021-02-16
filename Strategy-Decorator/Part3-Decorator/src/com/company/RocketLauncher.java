package com.company;

public class RocketLauncher extends Accessory {

    /*Use linked structure instead of table index
    to perform search operation effectively
     * */

    Armored_suit suit;

    public RocketLauncher(Armored_suit suit) {
        this.suit = suit;
    }


    @Override
    public String getDescription() {
        return suit.getDescription() + " + RocketLauncher";
    }

    @Override
    public double cost() {
        return 150 + suit.cost();
    }

    @Override
    public double weight() {
        return 7.5 + suit.weight();
    }
}
