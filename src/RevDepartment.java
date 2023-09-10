import java.util.ArrayList;

public class RevDepartment {
    private int d_number;
    private String d_name;
    private ArrayList <RevEmployee> empArr;
    
    public RevDepartment() {
        d_number = 1;
        d_name = "ASD";
        empArr = new ArrayList<RevEmployee>();
    }
    
    public RevDepartment(int d_number, String d_name) {
        this.d_number = d_number;
        this.d_name = d_name;
        empArr = new ArrayList<RevEmployee>();
    }
    
    public void setDNumber(int d_number) {
        this.d_number = d_number;
    }
    public void setDName(String d_name) {
        this.d_name = d_name;
    }
    
    public int getDNumber() {
        return d_number;
    }
    public String getDName() {
        return d_name;
    }
    
    public void addEmployee(RevEmployee e) {
        empArr.add(e);
    }
    
    public void removeEmployee(int idx) {
        empArr.remove(idx);
    }
    
    public int getEmployeeNumbers() {
        return empArr.size();
    }
    
    public void printBasicData() {
        for (int i = 0; i < empArr.size(); i++) {
            System.out.println("SSN => " + empArr.get(i).getSSN() + " || Name => " + empArr.get(i).getName() + " || Gender => " + empArr.get(i).getGender());
        }
    }
    
     public void printAllData() {
        for (int i = 0; i < empArr.size(); i++) {
            if(empArr.get(i) instanceof RevSalariedEmployee) {
                ((RevSalariedEmployee) empArr.get(i)).displayDetails(); // Type Casting
            }
            if(empArr.get(i) instanceof RevHourlyEmployee) {
                ((RevHourlyEmployee) empArr.get(i)).displayDetails();
            }
            if(empArr.get(i) instanceof RevCommissionEmployee) {
                ((RevCommissionEmployee) empArr.get(i)).displayDetails();
            }
        }
    }
}
