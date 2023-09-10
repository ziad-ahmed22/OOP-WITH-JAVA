public class SalariedEmployee extends Employee {
    private double bonus;
    
    public SalariedEmployee() {}
    
    public SalariedEmployee(String name, double age, String address, String nationality, double salary, String rank, double bonus) {
        super(name, age, address, nationality, salary, rank);
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
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Bonus => " + bonus);
    }
    
    public void specialFunc() {
        System.out.println("I Am A Spitial Function SalariedEmployee");
    }
}
