package com.company;

public class CaseStandartProperties implements CaseProperty {
    double width;
    double height;
    double depth;
    boolean dust_proof;
    boolean waterproof;
    String case_material;


    public CaseStandartProperties( double height, double width,  double depth,
                                  boolean dust_proof, boolean waterproof, String case_material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.dust_proof = dust_proof;
        this.waterproof = waterproof;
        this.case_material = case_material;
    }

    @Override
    public String toString() {
        String result = "";
        result += height + "x" + width + "x" + depth + "mm ";
        if( waterproof ) result += "waterproof ";
        if( dust_proof ) result += "dustproof ";
        result += case_material;
        return result;
    }
}
