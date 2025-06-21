package creational.factoryDesignPatternExample1;

public class PushNotification implements Notification{
    @Override
    public void notifyUser()
    {
        System.out.println("Sending Push Notification");
    }
}
