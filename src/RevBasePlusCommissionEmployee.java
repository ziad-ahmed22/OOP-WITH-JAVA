public class RevBasePlusCommissionEmployee extends RevCommissionEmployee {
    protected double base;
    
    public RevBasePlusCommissionEmployee() {}
    
    public RevBasePlusCommissionEmployee(String name, String address, int ssn, String gender, double gross_sales, double commission_rate, double base) {
        super(name, address, ssn, gender, gross_sales, commission_rate);
        this.base = base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }

    
    @Override
    public double earnings() {
        return base + super.earnings();
    }
    
    @Override
    public void displayDetails() {
        super.display();
        System.out.println("Base => " + base);
    }
    
    @Override
    public void displayEarnings() {
        System.out.println("Earnings Is: " + earnings());
    }
    
}
