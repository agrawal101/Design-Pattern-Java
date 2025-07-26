package Behavioral.templateDesignPattern;

public class EmailNotification extends NotificationSender{

    @Override
    protected String composeMessage(String message)
    {
        return "<html><body><p> "+message+" </p></body></html>";
    }

    @Override
    protected void sendMessage(String to, String message)
    {
        System.out.println("Sending email to "+message+" Email id "+to);
    }
}
