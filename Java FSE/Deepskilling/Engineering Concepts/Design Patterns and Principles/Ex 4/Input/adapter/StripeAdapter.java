package com.adapter.adapter;

import com.adapter.gateway.StripeGateway;
import com.adapter.payment.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway gateway = new StripeGateway();

    @Override
    public void processPayment(double amount) {
        gateway.makeStripePayment(amount * 100); // converting to cents
    }
}
