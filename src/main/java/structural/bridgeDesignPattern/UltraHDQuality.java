package structural.bridgeDesignPattern;

public class UltraHDQuality implements VideoQuality {

    @Override
    public void load(String quality)
    {
        System.out.println("Streaming "+quality+" in UltraHDQuality");
    }
}
