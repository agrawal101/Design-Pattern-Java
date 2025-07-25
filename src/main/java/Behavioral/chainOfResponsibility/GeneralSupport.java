package Behavioral.chainOfResponsibility;

public class GeneralSupport extends SupportHandler{


    @Override
    public void handleRequest(String requestType)
    {
        if(requestType.equals("General"))
        {
            System.out.println("Handled general request successfully");
        }
        else if(supportHandler!=null)
        {
            supportHandler.handleRequest(requestType);
        }
    }
}
