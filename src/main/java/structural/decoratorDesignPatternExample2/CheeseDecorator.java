package structural.decoratorDesignPatternExample2;

public class CheeseDecorator implements BaseDecorator{
    BasePizza basePizza;

    public CheeseDecorator(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+20;
    }

    @Override
    public String toString() {
        return "CheeseDecorator{" +
                "basePizza=" + basePizza +
                '}';
    }
}
