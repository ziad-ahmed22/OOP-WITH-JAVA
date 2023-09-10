// Definition
enum Gender {MALE, FEMALE}
enum Course {DATABASE, PROGRAMMING, MATH, PHYSICS}

public class RegestrationForm {
    String stdName;
    Gender stdGender;
    Course stdCourse;
    
    public RegestrationForm() {
        stdName = "No Name";
        stdGender = Gender.MALE;
        stdCourse = Course.DATABASE;
        // stdCourse = "Arabic"; // error
    }
}
