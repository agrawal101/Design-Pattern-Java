package structural.decoratorDesignPatternExample2;

public class FarmhousePizza implements BasePizza{

    @Override
    public int cost()
    {
        return 100;
    }
}
