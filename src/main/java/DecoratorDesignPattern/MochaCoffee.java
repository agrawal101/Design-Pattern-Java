package DecoratorDesignPattern;

public class MochaCoffee extends CoffeeDecorator{
    public MochaCoffee(Coffee coffee)
    {
        super(coffee);
    }
    @Override
    public String getDescription()
    {
        return coffee.getDescription()+" , Mocha";
    }
    @Override
    public double getCost()
    {
        return coffee.getCost()+ 4;
    }
}
