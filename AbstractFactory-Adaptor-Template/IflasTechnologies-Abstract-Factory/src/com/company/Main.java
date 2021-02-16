package com.company;

public class Main {

    public static void main(String[] args) {


        ProductionLine PL_Turkey = new TurkeyProducionLine();
        Smartphone ph1 = PL_Turkey.order_phone( "MaximumEffort" );

        System.out.println( "\n\n\n" );
        Smartphone ph2 = PL_Turkey.order_phone( "IflasDeluxe" );

        System.out.println( "\n\n\n" );
        Smartphone ph3 = PL_Turkey.order_phone( "I-I-Aman-Iflas" );







        ProductionLine PL_eurpe = new EuropeProductionLine();
        Smartphone ph4 = PL_eurpe.order_phone( "MaximumEffort" );

        System.out.println( "\n\n\n" );
        Smartphone ph5 = PL_eurpe.order_phone( "IflasDeluxe" );

        System.out.println( "\n\n\n" );
        Smartphone ph6 = PL_eurpe.order_phone( "I-I-Aman-Iflas" );




        ProductionLine PL_global = new GlobalProductionLine();
        Smartphone ph7 = PL_global.order_phone( "MaximumEffort" );

        System.out.println( "\n\n\n" );
        Smartphone ph8 = PL_global.order_phone( "IflasDeluxe" );

        System.out.println( "\n\n\n" );
        Smartphone ph9 = PL_global.order_phone( "I-I-Aman-Iflas" );

    }
}
