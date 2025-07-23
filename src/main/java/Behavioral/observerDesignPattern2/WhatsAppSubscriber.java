package Behavioral.observerDesignPattern2;

public class WhatsAppSubscriber implements Subscriber{
    String number;
    public WhatsAppSubscriber(String number)
    {
        this.number = number;
    }
    @Override
    public void update(String videoTitle)
    {
        System.out.println("Notified "+number+" "+videoTitle);
    }
}
