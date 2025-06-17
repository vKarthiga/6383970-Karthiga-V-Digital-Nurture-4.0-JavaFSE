package com.adapter.adapter;

import com.adapter.gateway.PayPalGateway;
import com.adapter.payment.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway = new PayPalGateway();

    @Override
    public void processPayment(double amount) {
        gateway.sendPayment(amount);
    }
}
