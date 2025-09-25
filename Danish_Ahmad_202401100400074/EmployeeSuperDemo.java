// ================== BASE CLASS ==================
class Employee {
    String name;
    int id;
    double salary;

    // No-arg constructor
    Employee() {
        System.out.println("Employee (no-arg) constructor called!");
    }

    // Parameterized constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Employee (parameterized) constructor called!");
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// ================== SINGLE INHERITANCE ==================    
class Manager extends Employee {
    String department;

    // No-arg constructor
    Manager() {
        // compiler automatically calls super()
        System.out.println("Manager (no-arg) constructor called!");
    }

    // Parameterized constructor
    Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // explicit call to Employee parameterized constructor
        this.department = department;
        System.out.println("Manager (parameterized) constructor called!");
    }

    public void showManagerInfo() {
        displayDetails();
        System.out.println("Department: " + department);
    }
}

// ================== MULTILEVEL INHERITANCE ==================
class SeniorManager extends Manager {
    int teamSize;

    SeniorManager(String name, int id, double salary, String department, int teamSize) {
        super(name, id, salary, department); // calling Manager parameterized constructor
        this.teamSize = teamSize;
        System.out.println("SeniorManager (parameterized) constructor called!");
    }

    public void showSeniorManagerInfo() {
        showManagerInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

// ================== HIERARCHICAL INHERITANCE ==================
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // calling Employee parameterized constructor
        this.programmingLanguage = programmingLanguage;
        System.out.println("Developer (parameterized) constructor called!");
    }

    public void showDeveloperInfo() {
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// ================== MAIN CLASS ==================
public class EmployeeSuperDemo {
    public static void main(String[] args) {
        System.out.println("=== Using No-Arg Constructor ===");
        Manager m1 = new Manager();  // calls Employee() then Manager()

        System.out.println("\n=== Using Parameterized Constructors ===");
        Manager m2 = new Manager("Alice", 101, 75000, "HR");

        System.out.println("\n=== Multilevel Inheritance ===");
        SeniorManager sm1 = new SeniorManager("Bob", 102, 120000, "IT", 15);

        System.out.println("\n=== Hierarchical Inheritance ===");
        Developer d1 = new Developer("Charlie", 103, 90000, "Java");
    }
}

