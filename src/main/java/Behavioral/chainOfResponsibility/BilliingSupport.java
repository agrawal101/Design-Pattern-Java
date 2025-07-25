package Behavioral.chainOfResponsibility;

public class BilliingSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType)
    {
        if(requestType.equals("Billing"))
        {
            System.out.println("Handled Billing request successfully");
        }
        else if(supportHandler!=null)
        {
            supportHandler.handleRequest(requestType);
        }
    }
}
