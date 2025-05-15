package Creational.AbstractFactoryDesignPattern;

public class Main {

    public static void main(String[] args) {
        UIComponentFactory uiComponentFactory = new LightThemeFactory();
        Application light = new Application(uiComponentFactory);

        light.renderUI();

        uiComponentFactory = new DarkThemeFactory();
        Application dark = new Application(uiComponentFactory);
        dark.renderUI();

    }
}
