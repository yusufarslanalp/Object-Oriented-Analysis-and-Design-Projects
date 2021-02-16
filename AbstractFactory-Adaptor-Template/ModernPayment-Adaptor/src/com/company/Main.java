package com.company;

public class Main {

    public static void main(String[] args) {
        ChildOfTurboPayment child_of_turbo = new ChildOfTurboPayment();
        TurboPaymentAdapter convert_to_modern = new TurboPaymentAdapter( child_of_turbo );
        ModernPayment modern_payment_reference = convert_to_modern;
        modern_payment_reference.pay( "string", 100, "string", "string" );
    }





}




