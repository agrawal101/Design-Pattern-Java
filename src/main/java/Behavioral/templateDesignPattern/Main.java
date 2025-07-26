package Behavioral.templateDesignPattern;

public class Main {

    public static void main(String[] args) {

        NotificationSender emailSender = new EmailNotification();
        emailSender.send("abc@gmail.com","Hello, How are you?");

        NotificationSender smsSender = new SmsNotification();
        smsSender.send("978678578","OTP is 4590");
    }
}
