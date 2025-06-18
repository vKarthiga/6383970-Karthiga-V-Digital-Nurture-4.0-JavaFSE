package strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Paying with Credit Card:");
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        paymentContext.pay(2500.0);

        System.out.println("\nPaying with PayPal:");
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.pay(1500.0);
    }
}
