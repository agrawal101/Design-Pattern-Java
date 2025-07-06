package structural.bridgeDesignPattern;

public class WebPlayer extends VideoPlayer{

    public WebPlayer(VideoQuality quality)
    {
        super(quality);
    }

    @Override
    public void play(String title)
    {
        System.out.println("Web player :");
        quality.load(title);
    }
}