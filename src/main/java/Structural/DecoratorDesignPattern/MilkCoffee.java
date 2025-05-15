package Structural.DecoratorDesignPattern;

public class MilkCoffee extends CoffeeDecorator
{
    public MilkCoffee(Coffee coffee)
    {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost()
    {
        return coffee.getCost()+1.0;
    }
}
