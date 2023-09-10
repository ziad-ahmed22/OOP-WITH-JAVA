public class SalariedEmployeeTwo extends EmployeeTwo {
    double bonus;
    
    public SalariedEmployeeTwo() {}
    
    public SalariedEmployeeTwo(String name, double age, double salary, String job, double bonus) {
        super(name, age, salary, job);
        this.bonus = bonus;
    }
    
    public void seyBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBons() {
        return bonus;
    }
    
    @Override
    public double getSalary() {
        return salary + bonus;
    }
}
