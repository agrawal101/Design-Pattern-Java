package structural.proxyDesignPatternExample2;
public class EmployeeImplProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    public EmployeeImplProxy()
    {
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee emp)
    {
        if(client.equalsIgnoreCase("Admin"))
        {
            employeeDao.create(client,emp);
            System.out.println("Employee Added Successfully");
        }
        else
            System.out.println("Permission Denied");
    }
    @Override
    public void delete(String client, int empID)
    {
        if(client.equalsIgnoreCase("Admin"))
        {
            employeeDao.delete(client,empID);
            System.out.println("Employee Deleted Successfully");
        }
        else
            System.out.println("Permission Denied");
    }
    @Override
    public Employee get(String client,int empId)
    {
        if(client.equalsIgnoreCase("Admin") || client.equalsIgnoreCase("User"))
            return employeeDao.get(client,empId);
        return null;
    }
}