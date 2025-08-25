package practicalLab;
class Employee
{
    private int empid;
    private  String name;
    private double salary;
    public void setId(int id){
        empid=id;
    }
    public void setName(String name){
        this.name=name;
     }
    public void setSalary(int sal)
    {
        salary=sal;
    }
    public void getEmployeeDetails(){
        System.out.println("ID = " +empid+" Name = "+name+" Salary = "+salary);
    }
}
public class Employdemo {
    public static void main(String[] args) {
        Employee emp=new Employee();
       // System.out.println("Id = "+emp.empid);
        emp.setId(100);
        emp.setName("Anu");
        emp.setSalary(10000);
        emp.getEmployeeDetails();
    }
}
