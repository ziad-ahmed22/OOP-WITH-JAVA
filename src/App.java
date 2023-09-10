public class App {
    public static void main(String[] args) throws Exception {
        // ==================================================        
        // // Public , Private
        // Rectangle r1 = new Rectangle();
        // // r1.width = 5; // No => Private
        // r1.length = 5; // Public
        // System.out.println(r1.length); // 5
        
        // // Setter , Getter
        // Rectangle r2 = new Rectangle();
        // r2.setLength(2);
        // r2.setWidth(4);
        // System.out.println(r2.getLength()); // 2
        // System.out.println(r2.getWidth()); // 4
        // System.out.println(r2.getArea()); // 8
        
        // Car c1 = new Car();
        // c1.setMaker("Toyota");
        // c1.setYearModel(2009);
        // c1.printData();
        
        // ==================================================
        // // Constructor
        // RectangleTwo r1 = new RectangleTwo();
        // System.out.println(r1.getArea()); // 200
        
        // // Constructor Overloading
        // RectangleTwo r2 = new RectangleTwo(2,4);
        // System.out.println(r2.getArea()); // 8
        
        // // Constructor Overloading
        // EmployeeZero e1 = new EmployeeZero();
        // e1.printEmpData();
        // EmployeeZero e2 = new EmployeeZero(101, "Ziad Ahmed");
        // e2.printEmpData();
        // EmployeeZero e3 = new EmployeeZero(102, "Ziad Ahmed", 8000, 200);
        // e3.printEmpData();
        // EmployeeZero e4 = new EmployeeZero(102, "Ziad Ahmed", 8000, 200, false);
        // e4.printEmpData();
        
        // // Methods Overloading
        // EmployeeZero e5 = new EmployeeZero();
        // e5.printSalaryAndBonus(); // 3000 // 500
        // EmployeeZero e6 = new EmployeeZero();
        // e6.setSalary(6000);
        // e6.printSalaryAndBonus(); // 6000 // 500
        // EmployeeZero e7 = new EmployeeZero();
        // e7.setSalary(6000, 200);
        // e7.printSalaryAndBonus(); // 6000 // 200
        
        // ==================================================
        // // Static 
        // Bus c1 = new Bus();        
        // Bus c2 = new Bus();
        // Bus.getNumberOfObjects(); // 2
        
        // System.out.println(Calc.add(1, 5));
        // System.out.println(Calc.sub(5, 2));
        // System.out.println(Calc.concat("Ziad", "Ahmed"));

        // ==================================================
        // // Primative Data Type
        // // Passing Values As Prameter
        // Square c1 = new Square();
        // double length = 5;
        // c1.setLength(length); // passing a copy of the variable
        // System.out.println(c1.getLength()); // 100
        // System.out.println(length); // 5
        
        // ==================================================
        // // Refrence Data Type
        // // Passing Objects As Prameter
        // Square c2 = new Square();
        // Square inpObj = new Square(10, 10);
        // c2.modifyObject(inpObj); // passing a refrence of the variable
        // System.out.println(inpObj.getLength()); // 500
        // System.out.println(inpObj.getWidth()); // 50
        
        // // Return Object
        // Square s1 = new Square(10, 20);
        // Square s2 = new Square(10, 30);
        // Square bigSquare = s1.add(s2);
        // System.out.println(bigSquare.getLength()); // 20
        // System.out.println(bigSquare.getWidth()); // 50
        
        // // Comparing Objects
        // Square s5 = new Square(10, 20);
        // Square s6 = new Square(10, 20);
        // System.out.println(s5 == s6); // false
        // System.out.println(s5.isEqualTo(s6)); // true
        
        // // Refrence Only Copy
        // Square s7 = new Square();
        // Square s8 = new Square(10, 20);
        // s7 = s8;
        // System.out.println(s7.getWidth()); // 20    
        // s8.setWidth(60);
        // System.out.println(s7.getWidth()); // 60

        // // Deep Copy
        // // Using A Constructor To Copy
        // Square s9 = new Square(10, 20);
        // Square s10 = new Square(s9);
        // System.out.println(s10.getWidth()); // 20    
        // s9.setWidth(60);
        // System.out.println(s10.getWidth()); // 20
        
        // ==================================================
        // // Inheritance
        // Person p1 = new Person("Ziad Ahmed", 24, "Sohag", "Egyptian");
        // System.out.println(p1.getName());
        
        // Student s1 = new Student("Ziad Ahmed", 24, "Sohag", "Egyptian", 3, "IT", 3.38);
        // System.out.println(s1.GPA);
        
        // Student s2 = new Student();
        // // I Am A Person Constructor 'Super Class'
        // // I Am A Student Constructor 'Sub Class'
        
        // ==================================================
        // // Method Override
        // Employee e1 = new Employee("Ziad", 24, "Sohag", "Egyptian", 5000, "Manager");
        // System.out.println(e1.getSalary()); // 5000
        
        // SalariedEmployee se1 = new SalariedEmployee("Ali", 22, "Cairo", "Egyptian", 3000, "Programmer", 500);
        // System.out.println(se1.getSalary()); // 3500
        
        // // Method Override
        // Person p2 = new Person("Medo", 26, "Alex", "Egyptian");
        // Employee e2 = new Employee("Ziad", 24, "Sohag", "Egyptian", 5000, "Manager");
        // SalariedEmployee se2 = new SalariedEmployee("Ali", 22, "Cairo", "Egyptian", 3000, "Programmer", 500);
        // System.out.println("===================");
        // p2.printDetails();
        // System.out.println("===================");
        // e2.printDetails();
        // System.out.println("===================");
        // se2.printDetails();
        
        // ==================================================
        // // Refrence Variable Emp1
        // // Emp1 => Type Of Employee 
        // //      => Pointer To The Address Of Object Type Employee
        // Employee Emp1 = new Employee("Ziad", 24, "Sohag", "Egyptian", 5000, "Manager");
        // System.out.println(Emp1.getName()); // ziad
        
        // // Refrence Variable Emp2
        // // Emp2 => Type Of Employee 
        // //      => Pointer To The Address Of Object Type SalariedEmployee
        // Employee Emp2 = new SalariedEmployee("Ali", 22, "Cairo", "Egyptian", 3000, "Programmer", 500);
        // System.out.println(Emp2.getName()); // Ali
        
        // // Note
        // // SpecialFunc Is In Class SalariedEmployee But You Cannot Access..
        // // It By A Refrence Variable Of Type Employee
        // // The Function Must Be In Super Classes
        // // Emp2.specialFunc(); // Error
        
        // ==================================================
        // Abstraction
        // EmployeeTwo e1 = new EmployeeTwo(); // error
        // cannot take an object from abstract class
        
        // SalariedEmployeeTwo se1 = new SalariedEmployeeTwo("Ziad", 24, 8000, "Manager", 200);
        // System.out.println(se1.getSalary()); // 8200
        
        // ==================================================
        // Interface
        // RetailItem r1 = new RetailItem(); // error
        // cannot take an object from interface
        
        // CD cd1 = new CD(250, "Movies CD");
        // System.out.println(cd1.getItemPrice()); // 250
        // System.out.println(cd1.getTitle()); // Movies CD
        
        // RetailItem cd2 = new CD(130, "Action CD");
        // // Refrence Variable cd2 Of Type RetailItem Pointer To Object Of Type CD
        
        // System.out.println(cd2.getItemPrice()); // 130
        // // System.out.println(cd2.getTitle()); // error
        
        // Displayable cd3 = new CD(458, "Romantic CD");
        // cd3.display();
        
        // ==================================================
        // // Enum
        // Course c1 = Course.MATH;
        // Course c2 = Course.DATABASE;        
        // Course c3 = Course.MATH;
        
        // System.out.println(c1.toString()); // MATH
        // System.out.println(c1.ordinal()); // 2 => index
        
        // System.out.println(c1.equals(c2)); // false
        // System.out.println(c1.compareTo(c2)); // 2 => positive number
        
        // System.out.println(c1.equals(c3)); // true
        // System.out.println(c1.compareTo(c3)); // 0 => zero => equals
        
        // ==================================================
        // ==================================================        
        // ==================================================
        // Revision
        // Used Classes
        //      => RevEmployee
        //      => RevDisplayable
        //      => RevSalariedEmployee
        //      => RevHourlyEmployee
        //      => RevCommissionEmployee
        //      => RevBasePlusCommissionEmployee
        //      => RevDepartment
        
        RevDepartment D1 = new RevDepartment(1, "Information System");
        
        RevSalariedEmployee sEmp = new RevSalariedEmployee("Ziad", "Sohag", 50, "Male", 9000, 600);
        RevHourlyEmployee hEmp = new RevHourlyEmployee("Ali", "Cairo", 22, "Male", 50, 8);
        RevCommissionEmployee cEmp = new RevCommissionEmployee("Dalia", "Assiut", 16, "Female", 250, 1.6);
        
        D1.addEmployee(sEmp);
        D1.addEmployee(hEmp);
        D1.addEmployee(cEmp);
        
        System.out.println("Number Of Employyes In " + D1.getDName() + " Department Is " + D1.getEmployeeNumbers());
        D1.printBasicData();
        D1.printAllData();
    }
}
