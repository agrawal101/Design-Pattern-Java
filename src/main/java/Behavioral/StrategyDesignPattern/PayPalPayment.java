package Behavioral.StrategyDesignPattern;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid Amount "+amount + " using Paypal");
    }
}
