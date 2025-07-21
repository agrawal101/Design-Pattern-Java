package Behavioral.iteratorDesignPattern;

public class Main {

    public static void main(String[] args) {
        YoutubePlayList playList = new YoutubePlayList();
        playList.addVideo(new Video("LLD"));
        playList.addVideo(new Video("HLD"));

        PlayListIterator iterator = playList.createIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().getTitle());
        }
    }
}