package Behavioral.ObserverDesignPattern;

public class EmailNotificationService implements Observer{

    @Override
    public void update(String productName)
    {
        System.out.println("Email "+productName +" is now back in stock");
    }
}
