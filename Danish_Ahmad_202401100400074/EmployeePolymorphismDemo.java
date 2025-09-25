// ---------------------- BASE CLASS ----------------------
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee() {
        // nothing inside
    }


    // ---------------- COMPILE-TIME POLYMORPHISM (Method Overloading) ----------------
    public void showDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public void showDetails(String department) {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }

    // ---------------- RUNTIME POLYMORPHISM (Method Overriding) ----------------
    public void work() {
        System.out.println(name + " is doing general employee tasks.");
    }
}

// ---------------------- DERIVED CLASS ----------------------
class Manager extends Employee {
    String department;

    // Constructor (no super used, fields assigned manually)
    Manager(String name, int id, double salary, String department) {
        // Assign parent fields directly
      
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

// ---------------------- DERIVED CLASS ----------------------
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}

// ---------------------- MAIN CLASS ----------------------
public class EmployeePolymorphismDemo {
    public static void main(String[] args) {

        // ---------------- COMPILE-TIME POLYMORPHISM (Overloading) ----------------
        System.out.println("=== Compile-time Polymorphism (Overloading) ===");
        Employee e1 = new Employee("Alice", 101, 50000);
        e1.showDetails();
        e1.showDetails("Finance");

        System.out.println();

        // ---------------- RUNTIME POLYMORPHISM (Overriding) ----------------
        System.out.println("=== Runtime Polymorphism (Overriding) ===");
        Employee emp;

        emp = new Manager("Bob", 102, 75000, "HR");   // Manager object
        emp.work();  // JVM decides Manager's work()

        emp = new Developer("Charlie", 103, 60000, "Java"); // Developer object
        emp.work();  // JVM decides Developer's work()
    }
}
