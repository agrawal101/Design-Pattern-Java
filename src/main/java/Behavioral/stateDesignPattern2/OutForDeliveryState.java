package Behavioral.stateDesignPattern2;

public class OutForDeliveryState implements OrderState{

    public void next(OrderContext context)
    {
        context.setState(new DeliveredState());
        System.out.println("Order is now Delivered");
    }

    public void cancel(OrderContext orderContext)
    {
        System.out.println("Order can not cancelled, its out for delivery");
    }

    public String getStateName()
    {
        return "Out for Delivery";
    }
}
