package structural.compositeDesignPattern;

public class Product implements CartItem{
    double price = 0;
    String name;

    public Product(String name,double price)
    {
        this.price = price;
        this.name = name;
    }
    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public void display(String indent)
    {
        System.out.println(indent +"Name of the product "+name+" Price "+price);
    }

}
