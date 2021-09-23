public class Main2 
{
  public static void main(String args[])
  {
    Employee myEmployee = new Employee("Frank", "Baum", 18, "Writer", 15.00);
    Employee myEmployee2 = new Employee();
    Employee myEmployee3 = new Employee("Howie", "Huges", 58, "C.E.O.", 215.00);

    System.out.println("Employee name: " + myEmployee.getFname() + " " + myEmployee.getLname());
    System.out.println("Employee age: " + myEmployee.getAge());
    System.out.println("Employee designation: " + myEmployee.getDesignation());
    System.out.println("Employee salary: $" + String.format("%.2f", myEmployee.getSalary()) + "hr, or $" + String.format("%.2f", (myEmployee.getSalary()*2080)) + " annually.\n");

    System.out.println("Employee name: " + myEmployee2.getFname() + " " + myEmployee2.getLname());
    System.out.println("Employee age: " + myEmployee2.getAge());
    System.out.println("Employee designation: " + myEmployee2.getDesignation());
    System.out.println("Employee salary: $" + String.format("%.2f", myEmployee2.getSalary()) + "hr, or $" + String.format("%.2f", (myEmployee2.getSalary()*2080)) + " annually.\n");

    System.out.println("Employee name: " + myEmployee3.getFname() + " " + myEmployee3.getLname());
    System.out.println("Employee age: " + myEmployee3.getAge());
    System.out.println("Employee designation: " + myEmployee3.getDesignation());
    System.out.println("Employee salary: $" + String.format("%.2f", myEmployee3.getSalary()) + "hr, or $" + String.format("%.2f", (myEmployee3.getSalary()*2080)) + " annually.\n");

    
  }
}

class Employee
{
    private String _fname;
    private String _lname;
    private int _age;
    private String _designation;
    private double _salary;


    public Employee()
    {
        _fname = "Jane";
        _lname = "Doe";
        _age = 0;
        _designation = "Employee";
        _salary = 0.00;
    }

    public Employee(String f,String l, int a, String d, double s)
    {
        _fname = f;
        _lname = l;
        _age = a;
        _designation = d;
        _salary = s;
    }

    void setFname(String f)
    {
        _fname = f;
    }

    void setLname(String l)
    {
        _lname = l;
    }

    void setAge(int a)
    {
        _age = a;
    }

    void setDesignation(String d)
    {
        _designation = d;
    }

    void setSalary(double s)
    {
        _salary = s;
    }

    String getFname()
    {
        return _fname;
    }

    String getLname()
    {
        return _lname;
    }
  
    int getAge()
    {
        return _age;
    }

    String getDesignation()
    {
        return _designation;
    }

    double getSalary()
    {
        return _salary;
    }
}
    

