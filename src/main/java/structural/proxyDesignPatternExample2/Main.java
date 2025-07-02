package structural.proxyDesignPatternExample2;
public class Main {
    public static void main(String[] args) {
        EmployeeDao empTableObj = new EmployeeImplProxy();
        empTableObj.create("Client",new Employee());
        System.out.println("Operation successfull");
    }
}