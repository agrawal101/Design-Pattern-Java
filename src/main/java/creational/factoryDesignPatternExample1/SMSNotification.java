package creational.factoryDesignPatternExample1;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser()
    {
        System.out.println("Sending SMS Notification");
    }
}
