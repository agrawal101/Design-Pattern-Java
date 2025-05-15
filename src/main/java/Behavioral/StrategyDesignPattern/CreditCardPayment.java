package Behavioral.StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid Amount "+amount + " using Credit Card");
    }
}
