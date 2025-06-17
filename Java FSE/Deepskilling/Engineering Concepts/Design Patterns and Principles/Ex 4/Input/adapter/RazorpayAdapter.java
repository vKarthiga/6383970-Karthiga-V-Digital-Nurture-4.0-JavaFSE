package com.adapter.adapter;

import com.adapter.gateway.RazorpayGateway;
import com.adapter.payment.PaymentProcessor;

public class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway gateway = new RazorpayGateway();

    @Override
    public void processPayment(double amount) {
        gateway.doTransaction(amount);
    }
}
