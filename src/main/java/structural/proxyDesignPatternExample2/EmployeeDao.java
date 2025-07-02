package structural.proxyDesignPatternExample2;
public interface EmployeeDao {
    void create(String client,Employee emp);
    void delete(String client,int empId);
    Employee get(String client,int empId);
}