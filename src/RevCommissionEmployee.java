public class RevCommissionEmployee extends RevEmployee implements RevDisplayable{
    protected double gross_sales;
    protected double commission_rate;
    
    public RevCommissionEmployee() {}
    
    public RevCommissionEmployee(String name, String address, int ssn, String gender, double gross_sales, double commission_rate) {
        super(name, address, ssn, gender);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }
    
    public void setGrossSales(double gross_sales) {
        this.gross_sales = gross_sales;
    }
    public void setCommisionRate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    
    public double getGrossSales() {
        return gross_sales;
    }
    public double getCommisionRate() {
        return commission_rate;
    }
    
    @Override
    public double earnings() {
        return gross_sales * commission_rate;
    }
    
    public void displayDetails() {
        super.display();
        System.out.println("Gross Sales => " + gross_sales + " || Commission Rate => " + commission_rate);
    }
    
    public void displayEarnings() {
        System.out.println("Earnings Is: " + earnings());
    }
}
