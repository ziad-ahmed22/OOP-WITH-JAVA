public class Employee extends Person {
    protected double salary;
    protected String rank;
    
    public Employee() {}
    
    public Employee(String name, double age, String address, String nationality, double salary, String rank) {
        super(name, age, address, nationality);
        this.salary = salary;
        this.rank = rank;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    // Will Be Override
    public double getSalary() {
        return salary;
    }
    public String getRank() {
        return rank;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Salary      => " + salary);
        System.out.println("Rank        => " + rank);
    }
    
    // public void specialFunc() {
    //     System.out.println("I Am A Spitial Function Employee");
    // }
}
