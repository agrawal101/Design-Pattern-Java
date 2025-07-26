package Behavioral.templateDesignPattern;

public class SmsNotification extends NotificationSender{

    @Override
    protected String composeMessage(String message)
    {
        return "[SMS] "+message;
    }

    @Override
    protected void sendMessage(String to, String message)
    {
        System.out.println("Message sent to "+to+" message");
    }

    @Override
    protected void postSendAnalytics(String to)
    {
        System.out.println("Post send analytics from SmsNotification "+to);
    }
}
