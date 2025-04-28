package AbstractFactoryDesignPattern;

public class DarkInputField implements InputField{
    @Override
    public void render()
    {
        System.out.println("Rendering Dark Input Field");
    }
}
