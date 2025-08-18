package Behavioral.visitorDesignPattern;

public class InvoiceVisitor implements ItemVisitor{

    @Override
    public void visit(PhysicalProduct item)
    {
        System.out.println("Invoice "+item.name+" : shipping to customer Weight : "+item.weight);
    }

    @Override
    public void visit(GiftCard item)
    {
        System.out.println("Gift "+item.code+" card Amount "+item.amount);
    }

    @Override
    public void visit(DigitalProduct item)
    {
        System.out.println("Digital product "+item.name+ " Size "+item.downloadSizeInMB);
    }
}
