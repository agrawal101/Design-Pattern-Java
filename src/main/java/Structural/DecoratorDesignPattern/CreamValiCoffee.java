package Structural.DecoratorDesignPattern;

public class CreamValiCoffee extends CoffeeDecorator{

    public CreamValiCoffee(Coffee coffee)
    {
        super(coffee);
    }
    @Override
    public String getDescription()
    {
        return coffee.getDescription()+" , Cream";
    }
    @Override
    public double getCost()
    {
        return coffee.getCost()+2.0;
    }
}
