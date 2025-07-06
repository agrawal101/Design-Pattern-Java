package structural.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartItem item1 = new Product("LLD",500);
        CartItem item2 = new Product("HLD",400);
        CartItem item3 = new Product("DSA",1000);
        CartItem item4 = new Product("Java",800);

        ProductBundle bundle1 = new ProductBundle("Interview Prep");
        bundle1.addItem(item1);
        bundle1.addItem(item2);
        bundle1.addItem(item3);

        ProductBundle bundle2 = new ProductBundle("Self Help");
        bundle2.addItem(new Product("Atomic Habits",300));
        bundle2.addItem(new Product("Ikigai",350));
        bundle2.addItem(new Product("Wings of fire",600));

        List<CartItem> cart = new ArrayList<>();
        cart.add(item1);
        cart.add(bundle1);
        cart.add(bundle2);

        for(CartItem cartItem:cart)
        {
            System.out.println("Price "+cartItem.getPrice());
        }
    }
}
