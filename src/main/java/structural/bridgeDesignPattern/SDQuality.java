package structural.bridgeDesignPattern;

public class SDQuality implements VideoQuality {
    @Override
    public void load(String quality)
    {
        System.out.println("Streaming "+quality+" in SDQuality");
    }
}
