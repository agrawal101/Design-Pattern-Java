package structural.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{

    List<CartItem> list;
    String name;

    public ProductBundle(String name)
    {
        list = new ArrayList<>();
        this.name = name;
    }
    @Override
    public void display(String indent)
    {
        for(CartItem cartItem:list)
            cartItem.display(indent+" ");
    }

    @Override
    public double getPrice()
    {
        double price = 0;
        for(CartItem cartItem:list)
            price+=cartItem.getPrice();
        return price;
    }

    public void addItem(CartItem item)
    {
        list.add(item);
    }
}
