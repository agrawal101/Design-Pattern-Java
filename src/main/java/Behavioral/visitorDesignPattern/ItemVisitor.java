package Behavioral.visitorDesignPattern;

public interface ItemVisitor {

    void visit(PhysicalProduct item);
    void visit(GiftCard item);
    void visit(DigitalProduct item);
}
