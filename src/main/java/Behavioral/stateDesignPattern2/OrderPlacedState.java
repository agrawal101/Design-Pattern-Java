package Behavioral.stateDesignPattern2;

public class OrderPlacedState implements OrderState{

    public void next(OrderContext context)
    {
        context.setState(new PreparingState());
        System.out.println("Order is now being prepared");
    }

    public void cancel(OrderContext orderContext)
    {
        orderContext.setState(new CancellationState());
        System.out.println("Order has been cancelled");
    }

    public String getStateName()
    {
        return "Order Placed";
    }
}