package Behavioral.iteratorDesignPattern;

import java.util.List;

public class YoutubePlayListIterator implements PlayListIterator{

    private List<Video> videos;
    private int pos;

    public YoutubePlayListIterator(List<Video> videos)
    {
        this.videos = videos;
        this.pos = 0;
    }

    @Override
    public boolean hasNext()
    {
        return pos<videos.size();
    }

    @Override
    public Video next()
    {
        return hasNext()?videos.get(pos++):null;
    }
}
