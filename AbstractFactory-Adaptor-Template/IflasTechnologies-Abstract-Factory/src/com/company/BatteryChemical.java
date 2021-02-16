package com.company;

public class BatteryChemical implements BatteryProperty {
    String chemical;


    public BatteryChemical(String chemical) {
        this.chemical = chemical;
    }

    @Override
    public String toString() {
        return chemical;
    }
}
