package com.adapter.gateway;

public class StripeGateway {
    public void makeStripePayment(double amountInCents) {
        System.out.println("Processing payment of $" + (amountInCents / 100) + " via Stripe.");
    }
}
