package Behavioral.observerDesignPattern1;

public class AppNotificationService implements Observer{
    @Override
    public void update(String productName)
    {
        System.out.println("App Notification "+productName+" is Back in stock ");
    }
}
