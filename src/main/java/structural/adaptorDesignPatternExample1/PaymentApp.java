package structural.adaptorDesignPatternExample1;

public class PaymentApp {

    public static void main(String[] args) {
        RazorpayGateway razorpayGateway = new RazorpayGateway();
        RazorpayAdaptor razorpayAdaptor = new RazorpayAdaptor(razorpayGateway);
        razorpayAdaptor.pay(100);

    }
}
