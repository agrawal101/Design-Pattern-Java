package Behavioral.templateDesignPattern;

public abstract class NotificationSender {

    public final void send(String to, String message)
    {
        rateLimitCheck(to);
        validateRecipent(to);

        String format = formatMessage(message);
        preSendAuditLog(to,format);

        String composeMessage = composeMessage(format);
        sendMessage(to,composeMessage);

        postSendAnalytics(to);
    }

    public void rateLimitCheck(String to)
    {
        System.out.println("Rate limit Check "+to);
    }
    public void validateRecipent(String to)
    {
        System.out.println("Validate Receipent "+to);
    }

    public String formatMessage(String message)
    {
        return message.trim();
    }
    public void preSendAuditLog(String to, String message)
    {
        System.out.println("Logging before send: "+message +" to "+to);
    }
    protected abstract String composeMessage(String formatMessage);
    protected abstract void sendMessage(String to,String message);
    protected void postSendAnalytics(String to)
    {
        System.out.println("Analytics updated for : "+to);
    }
}