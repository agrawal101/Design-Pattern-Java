package creational.factoryDesignPatternExample1;
public class NotificationFactory {
    public Notification createNotification(String type)
    {
        return switch (type) {
            case "SMS" -> new SMSNotification();
            case "Email" -> new EmailNotification();
            case "Push" -> new PushNotification();
            default -> null;
        };
    }
}
