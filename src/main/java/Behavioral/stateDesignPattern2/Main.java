package Behavioral.stateDesignPattern2;

public class Main {

    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        System.out.println("Current state : "+order.getCurrentState());

        order.next();
        order.next();
        order.cancel();
        order.next();
        order.cancel();

        System.out.println("Final state : "+order.getCurrentState());
    }
}
