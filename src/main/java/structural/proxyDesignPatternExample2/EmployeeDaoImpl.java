package structural.proxyDesignPatternExample2;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee emp)
    {
        System.out.println("Employee Added successfully");
    }
    @Override
    public Employee get(String client, int empId)
    {
        System.out.println("Employee Fetched successfully");
        return new Employee();
    }
    @Override
    public void delete(String client, int empId)
    {
        System.out.println("Employee Deleted successfully");
    }

}
