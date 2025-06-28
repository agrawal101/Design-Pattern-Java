package structural.decoratorDesignPatternExample2;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new CheeseDecorator(new MushroomDecorator(new CheeseDecorator(new FarmhousePizza())));

        System.out.println(basePizza.cost());
    }



}
