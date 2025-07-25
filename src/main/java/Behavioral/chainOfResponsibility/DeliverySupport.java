package Behavioral.chainOfResponsibility;

public class DeliverySupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType)
    {
        if(requestType.equals("Delivery"))
        {
            System.out.println("Handled delivery request successfully");
        }
        else if(supportHandler!=null)
        {
            supportHandler.handleRequest(requestType);
        }
        else {
            System.out.println("DeliverySupport: No handler found for request");
        }
    }
}
