package structural.bridgeDesignPattern;

public class k8Quality implements VideoQuality{

    @Override
    public void load(String quality)
    {
        System.out.println("Streaming "+quality+" in 8k Quality");
    }
}
