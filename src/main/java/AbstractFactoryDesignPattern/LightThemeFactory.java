package AbstractFactoryDesignPattern;

public class LightThemeFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }
    @Override
    public InputField createInputField()
    {
        return new LightInputField();
    }
}
