package structural.bridgeDesignPattern;

public class MobilePlayer extends VideoPlayer{

    public MobilePlayer(VideoQuality quality)
    {
        super(quality);
    }

    @Override
    public void play(String title)
    {
        System.out.println("Mobiler Player playing :");
        quality.load(title);
    }
}
