package structural.decoratorDesignPatternExample2;

public class MushroomDecorator implements BaseDecorator{

    BasePizza basePizza;
    public MushroomDecorator(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

    @Override
    public int cost()
    {
        return basePizza.cost()+30;
    }

    @Override
    public String toString() {
        return "MushroomDecorator{" +
                "basePizza=" + basePizza +
                '}';
    }
}
