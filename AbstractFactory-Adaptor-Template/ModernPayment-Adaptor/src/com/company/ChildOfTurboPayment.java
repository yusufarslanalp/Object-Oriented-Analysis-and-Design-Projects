package com.company;

public class ChildOfTurboPayment implements TurboPayment {
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount,
                          String destinationTurboOfCourse, String installmentsButInTurbo)
    {
        System.out.println( "I imlemented TurboPayment Interface" );
        System.out.println( "ModernPayment interface can use me with adapter design patern" );
        return 0;
    }
}


