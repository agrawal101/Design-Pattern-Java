package Behavioral.observerDesignPattern1;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
private String name;
private boolean inStock;
private List<Observer> observerList = new ArrayList<>();

public Product(String name)
{
    this.name = name;
}
@Override
public void registerObserver(Observer observer)
{
    observerList.add(observer);
}
@Override
public void removeObserver(Observer observer)
{
    observerList.remove(observer);
}
@Override
public void notifyObserver()
{
    for(Observer o:observerList)
    {
        o.update(name);
    }
}
public void updateStock(boolean inStock)
{
    this.inStock = inStock;
    if(inStock)
        notifyObserver();
}
}
