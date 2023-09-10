public class Person {
    protected String name;
    protected double age;
    protected String address;
    protected String nationality;
    
    public Person() {
        System.out.println("I Am A Person Constructor 'Super Class'");
    }
    
    public Person(String name, double age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public String getName() {
        return name;
    }
    public double getAge() {
       return age;
    }
    public String getAddress() {
        return address;
    }
    public String getNationality() {
        return nationality;
    }
    
    // will be override
    public void printDetails() {
        System.out.println("Name        => " + name);
        System.out.println("Age         => " + age);
        System.out.println("Address     => " + address);
        System.out.println("Nationality => " + nationality);
    }
    
    // Final Keyword
    // public final void printDetails() {}
    // Prevent Sub Classes From Overriding The Method
}
