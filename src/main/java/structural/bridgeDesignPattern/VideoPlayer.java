package structural.bridgeDesignPattern;

public abstract class VideoPlayer {

    protected VideoQuality quality;
    public VideoPlayer(VideoQuality quality)
    {
        this.quality = quality;
    }
    abstract void play(String title);

}
