package Behavioral.stateDesignPattern2;

public interface OrderState {

    void next(OrderContext context);
    void cancel(OrderContext context);
    String getStateName();
}
