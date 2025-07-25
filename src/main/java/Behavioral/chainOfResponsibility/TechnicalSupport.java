package Behavioral.chainOfResponsibility;

public class TechnicalSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType)
    {
        if(requestType.equals("Technical"))
        {
            System.out.println("Handled technical request successfully");
        }
        else if(supportHandler!=null)
        {
            supportHandler.handleRequest(requestType);
        }
    }
}
