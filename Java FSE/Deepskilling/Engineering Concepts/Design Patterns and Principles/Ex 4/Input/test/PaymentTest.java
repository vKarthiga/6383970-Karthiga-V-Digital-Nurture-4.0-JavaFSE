package com.adapter.test;

import com.adapter.payment.PaymentProcessor;
import com.adapter.adapter.*;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(250.00);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(500.00);

        PaymentProcessor razorpay = new RazorpayAdapter();
        razorpay.processPayment(750.00);
    }
}
