package Behavioral.observerDesignPattern2;

public class Main {

    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Lets do it");
        channel.subscribe(new EmailSubscriber("abc@gmail.com"));
        channel.subscribe(new WhatsAppSubscriber("123456789"));
        channel.uploadVideo("LLD");
    }


}
