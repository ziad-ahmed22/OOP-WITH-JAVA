public abstract class EmployeeTwo {
    String name;
    double age;
    double salary;
    String job;
    
    public EmployeeTwo() {}
    
    public EmployeeTwo(String name, double age, double salary, String job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // will be override by getSalary func in SalariedEmployeeTwo Class
    public abstract double getSalary();
}
