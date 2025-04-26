package FactoryDesignPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.createNotification("Email");
        notification.notifyUser();

        notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        notification = notificationFactory.createNotification("Push");
        notification.notifyUser();
    }
}
