package Behavioral.visitorDesignPattern;

public interface Item {
    void accept(ItemVisitor visitor);
}
