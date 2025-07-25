package Behavioral.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        SupportHandler general = new GeneralSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler billing = new BilliingSupport();
        SupportHandler delivery = new DeliverySupport();

        general.setNextHandler(billing);
        billing.setNextHandler(technical);
        technical.setNextHandler(delivery);

        general.handleRequest("General");
        general.handleRequest("Delivery");
        general.handleRequest("Unknown");
    }
}