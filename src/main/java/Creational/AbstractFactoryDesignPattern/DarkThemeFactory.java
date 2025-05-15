package Creational.AbstractFactoryDesignPattern;

public class DarkThemeFactory implements UIComponentFactory{
    @Override
    public Button createButton()
    {
        return new DarkButton();
    }
    @Override
    public InputField createInputField()
    {
        return new DarkInputField();
    }
}
