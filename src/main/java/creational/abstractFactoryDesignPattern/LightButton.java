package creational.abstractFactoryDesignPattern;

public class LightButton implements Button{

    @Override
    public void render()
    {
        System.out.println("Rendering LightButton");
    }
}
