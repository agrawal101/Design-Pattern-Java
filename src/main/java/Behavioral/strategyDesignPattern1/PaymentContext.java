package Behavioral.strategyDesignPattern1;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount)
    {
        paymentStrategy.pay(amount);
    }
}
