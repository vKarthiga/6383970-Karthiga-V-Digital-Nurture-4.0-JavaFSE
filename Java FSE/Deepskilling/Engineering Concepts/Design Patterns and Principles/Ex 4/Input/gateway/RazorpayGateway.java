package com.adapter.gateway;

public class RazorpayGateway {
    public void doTransaction(double rupeeAmount) {
        System.out.println("Processing payment of ₹" + rupeeAmount + " via Razorpay.");
    }
}
