package Structural.ProxyDesignPattern;

public class RealImage implements Image{
private String fileName;
    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk();
    }
    public void loadFromDisk()
    {
        System.out.println("Loading "+fileName+" from Disk");
    }
    @Override
    public void display(){
        System.out.println("Displaying "+fileName);
    }
}
