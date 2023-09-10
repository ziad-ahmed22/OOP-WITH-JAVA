public class RevSalariedEmployee extends RevEmployee implements RevDisplayable{
    protected double salary;
    protected double bonus;
    
    public RevSalariedEmployee() {}
    
    public RevSalariedEmployee(String name, String address, int ssn, String gender, double salary, double bonus) {
        super(name, address, ssn, gender);
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double setSalary() {
        return salary;
    }
    public double setBonus() {
        return bonus;
    }
    
    @Override
    public double earnings() {
        return salary + bonus;
    }
    
    public void displayDetails() {
        super.display();
        System.out.println("Salary => " + salary + " || Bonus => " + bonus);
    }
    
    public void displayEarnings() {
        System.out.println("Earnings Is: " + earnings());
    }
}
