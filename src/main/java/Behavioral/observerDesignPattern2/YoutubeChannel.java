package Behavioral.observerDesignPattern2;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{
    List<Subscriber> subscriberList = new ArrayList<>();
    String channelName;

    public YoutubeChannel(String channelName)
    {
        this.channelName = channelName;
    }
    @Override
    public void subscribe(Subscriber subscriber)
    {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber)
    {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String videoTitle)
    {
        for(Subscriber subscriber:subscriberList)
        {
            subscriber.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle){
        System.out.println(channelName+" upload "+videoTitle+ " \n");
        notifySubscriber(videoTitle);
    }
}