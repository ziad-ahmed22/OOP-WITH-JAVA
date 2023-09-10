public class EmployeeZero {
    private int id;
    private String name;
    private double salary;
    private double bonus;
    private boolean resident;
    
    public EmployeeZero() {
        id = 100;
        name = "Unknow";
        salary = 3000;
        bonus = 500;
        resident = true;
    }
    
    public EmployeeZero(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public EmployeeZero(int id, String name, double salary, double bonus) {
        // this.id = id;
        // this.name = name;
        this(id, name);
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public EmployeeZero(int id, String name, double salary, double bonus, boolean resident) {
        this(id, name, salary, bonus);
        this.resident = resident;
    }
    
    public void printEmpData() {
        System.out.println("ID       => " + id);
        System.out.println("Name     => " + name);
        System.out.println("Salary   => " + salary);
        System.out.println("Bonus    => " + bonus);
        System.out.println("Resident => " + resident);
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setSalary(double salary, double bonus) {
        // this.salary = salary;
        this.setSalary(salary);
        this.bonus = bonus;
    }
    
    public void printSalaryAndBonus() {
        System.out.println("Salary  => " + salary);        
        System.out.println("Bonus   => " + bonus);
    }
}
