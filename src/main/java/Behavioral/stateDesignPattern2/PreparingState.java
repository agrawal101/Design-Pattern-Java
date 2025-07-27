package Behavioral.stateDesignPattern2;

public class PreparingState implements OrderState{

    public void next(OrderContext context)
    {
        context.setState(new OutForDeliveryState());
        System.out.println("Order is now out for delivery");
    }

    public void cancel(OrderContext orderContext)
    {
        orderContext.setState(new CancellationState());
        System.out.println("Order has been cancelled");
    }

    public String getStateName()
    {
        return "Preparing";
    }
}
