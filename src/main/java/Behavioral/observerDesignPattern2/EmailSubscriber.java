package Behavioral.observerDesignPattern2;

public class EmailSubscriber implements Subscriber{

    String email;
    public EmailSubscriber(String email)
    {
        this.email = email;
    }
    @Override
    public void update(String videoTitle)
    {
        System.out.println("Email Sent  "+email+" " +videoTitle);
    }
}
