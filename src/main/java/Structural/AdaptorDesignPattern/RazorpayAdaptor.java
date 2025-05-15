package Structural.AdaptorDesignPattern;

public class RazorpayAdaptor implements PaymentProcessor{
    private RazorpayGateway razorpayGateway;
    public RazorpayAdaptor(RazorpayGateway razorpayGateway)
    {
        this.razorpayGateway = razorpayGateway;
    }
    @Override
    public void pay(int amount)
    {
        razorpayGateway.makePayment(1000*amount);
    }
}
