package com.company;

public class GlobalProductionLine extends ProductionLine {
    @Override
    Smartphone create_smartphone(String model) {
        Smartphone phone = null;
        SmartphoneComponentFactory  SCompoent_factory = new GlobalComponentFactory();

        if( model.equalsIgnoreCase( "MaximumEffort" ) )
        {
            phone = new MaximumEffort( SCompoent_factory );
        }
        else if( model.equalsIgnoreCase( "IflasDeluxe" ) )
        {
            phone = new IflasDeluxe( SCompoent_factory );
        }
        else if( model.equalsIgnoreCase( "I-I-Aman-Iflas" ) )
        {
            phone = new IIAmanIflas( SCompoent_factory );
        }
        return phone;
    }
}
