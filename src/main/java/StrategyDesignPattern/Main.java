package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.pay(1000);
        context = new PaymentContext(new PayPalPayment());
        context.pay(2000);
        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(5000);
    }
}
