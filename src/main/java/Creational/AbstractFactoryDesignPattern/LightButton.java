package Creational.AbstractFactoryDesignPattern;

public class LightButton implements Button{

    @Override
    public void render()
    {
        System.out.println("Rendering LightButton");
    }
}
