package structural.decoratorDesignPatternExample1;

public class BaseCoffee implements Coffee{

    @Override
    public String getDescription()
    {
        return "Base Coffee";
    }

    @Override
    public double getCost()
    {
        return 5.0;
    }
}
