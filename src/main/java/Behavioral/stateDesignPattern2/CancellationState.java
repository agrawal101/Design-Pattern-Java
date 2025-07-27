package Behavioral.stateDesignPattern2;

public class CancellationState implements OrderState{

    public void next(OrderContext context)
    {
        System.out.println("Cancelled order cannot move to next state");
    }

    public void cancel(OrderContext orderContext)
    {
        System.out.println("Order is already cancelled");
    }

    public String getStateName()
    {
        return "Cancelled";
    }
}
