package com.company;

public class CaseWPDegree implements CaseProperty {
    double waterproof_degree;


    public CaseWPDegree(double waterproof_degree) {
        this.waterproof_degree = waterproof_degree;
    }

    @Override
    public String toString() {
        return "waterproof up to " + waterproof_degree + "m";
    }
}
