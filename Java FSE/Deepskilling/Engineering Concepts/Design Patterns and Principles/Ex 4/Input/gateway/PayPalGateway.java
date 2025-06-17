package com.adapter.gateway;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
