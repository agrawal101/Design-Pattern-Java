package creational.abstractFactoryDesignPattern;

public class Application {

    private UIComponentFactory factory;
    public Application(UIComponentFactory factory)
    {
        this.factory = factory;
    }
    public void renderUI()
    {
        Button button = factory.createButton();
        InputField inputField = factory.createInputField();
        button.render();
        inputField.render();
    }
}
