package com.company;

public class TurboPaymentAdapter implements ModernPayment {
    TurboPayment turbo_payment;

    public TurboPaymentAdapter(TurboPayment turbo_payment) {
        this.turbo_payment = turbo_payment;
    }

    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        return turbo_payment.payInTurbo( cardNo, amount, destination, installments );
    }
}




