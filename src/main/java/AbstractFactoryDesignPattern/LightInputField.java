package AbstractFactoryDesignPattern;

public class LightInputField implements InputField{
    @Override
    public void render()
    {
        System.out.println("Rendering Light Input Field");
    }
}
