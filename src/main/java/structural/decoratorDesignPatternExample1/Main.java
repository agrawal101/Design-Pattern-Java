package structural.decoratorDesignPatternExample1;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new MilkCoffee(new MochaCoffee(new CreamValiCoffee(new BaseCoffee())));
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
