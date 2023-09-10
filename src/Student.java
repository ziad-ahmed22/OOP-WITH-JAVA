public class Student extends Person {
    int level;
    String specialization;
    double GPA;
    
    public Student() {
        System.out.println("I Am A Student Constructor 'Sub Class'");
    }
    
    public Student(String name, double age, String address, String nationality, int level, String specialization, double GPA) {
        super(name, age, address, nationality);
        this.level = level;
        this.specialization = specialization;
        this.GPA = GPA;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public int getLevel() {
        return level;
    }
    public String getSpecialization() {
        return specialization;
    }
    public double getGPA() {
        return GPA;
    }
    

}
