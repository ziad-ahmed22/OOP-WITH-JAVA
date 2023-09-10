public abstract class RevEmployee {
    protected String name;
    protected String address;
    protected int ssn;
    protected String gender;
    
    public RevEmployee() {}
    
    public RevEmployee(String name, String address, int ssn, String gender) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.gender = gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSSN(int ssn) {
        this.ssn = ssn;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getSSN() {
        return ssn;
    }
    public String getGender() {
        return gender;
    }
    
    public abstract double earnings();
    
    public void display() {
        System.out.println("Name => " + name + " || Address => " + address + " || SSN => " + ssn + " || Gender => " + gender);
    }
}
