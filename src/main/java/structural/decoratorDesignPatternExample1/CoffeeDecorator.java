package structural.decoratorDesignPatternExample1;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee)
    {
        this.coffee = coffee;
    }
    @Override
    public String getDescription()
    {
        return coffee.getDescription();
    }
    @Override
    public double getCost()
    {
        return coffee.getCost();
    }
}
