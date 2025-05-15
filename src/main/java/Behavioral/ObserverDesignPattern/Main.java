package Behavioral.ObserverDesignPattern;

public class Main {

    public static void main(String[] args) {
        Product iphone = new Product("Iphone 16 pro max");
        Observer email = new EmailNotificationService();
        Observer sms = new SmsNotificationService();
        Observer app = new AppNotificationService();

        iphone.registerObserver(email);
        iphone.registerObserver(sms);
        iphone.registerObserver(app);

        iphone.updateStock(true);
    }
}
