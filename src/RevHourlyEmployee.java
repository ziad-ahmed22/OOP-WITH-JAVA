public class RevHourlyEmployee extends RevEmployee implements RevDisplayable{
    protected double hour_rate;
    protected int no_of_hours;
    
    public RevHourlyEmployee() {}
    
    public RevHourlyEmployee(String name, String address, int ssn, String gender, double hour_rate, int no_of_hours) {
        super(name, address, ssn, gender);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }
    
    public void setHourRate(double hour_rate) {
        this.hour_rate = hour_rate;
    }
    public void setNumOfHours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }
    
    public double getHourRate() {
        return hour_rate;
    }
    public int getNumOfHours() {
        return no_of_hours;
    }
    
    @Override
    public double earnings() {
        return no_of_hours * hour_rate;
    }
    
    public void displayDetails() {
        super.display();
        System.out.println("N Of Hours => " + no_of_hours + " || Hour Rate => " + hour_rate);
    }
    
    public void displayEarnings() {
        System.out.println("Earnings Is: " + earnings());
    }
}
