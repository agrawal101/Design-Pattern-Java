package structural.adaptorDesignPatternExample1;

public class RazorpayGateway {
    public void makePayment(int amount){
        System.out.println("Make Payment in rupees "+amount/100.0+" using RazorPay");
    }
}
