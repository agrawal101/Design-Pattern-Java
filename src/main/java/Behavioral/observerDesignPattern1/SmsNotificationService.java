package Behavioral.observerDesignPattern1;

public class SmsNotificationService implements Observer{
    @Override
    public void update(String productName)
    {
        System.out.println("Sms Alert "+productName+ " Is Back in stock");
    }
}
