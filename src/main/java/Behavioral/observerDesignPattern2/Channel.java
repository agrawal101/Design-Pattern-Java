package Behavioral.observerDesignPattern2;

public interface Channel {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscriber(String videoTitle);
}
