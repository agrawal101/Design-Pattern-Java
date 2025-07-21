package Behavioral.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlayList implements PlayList{

    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video video)
    {
        videos.add(video);
    }
    @Override
    public PlayListIterator createIterator(){
        return new YoutubePlayListIterator(videos);
    }
}
