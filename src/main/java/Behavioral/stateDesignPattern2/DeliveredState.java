package Behavioral.stateDesignPattern2;

public class DeliveredState implements OrderState{

    public void next(OrderContext context)
    {
        System.out.println("Order is already Delivery");
    }

    public void cancel(OrderContext orderContext)
    {
        System.out.println("Order can not cancelled, its delivered");
    }

    public String getStateName()
    {
        return "Order Delivered";
    }
}
