class Employee {
    // 🔹 Non-static (instance) variables → separate copy for each employee
    String name;
    int id;

    // 🔹 Static (class) variable → one copy shared by all employees
    static String companyName = "TechSoft";

    // 🔹 Non-static method → can access both static & non-static members
    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Company: " + companyName); // static variable accessed
        System.out.println("----------------------------");
    }

    // 🔹 Static method → belongs to class, can only access static members directly
    static void displayCompany() {
        System.out.println("Company Name: " + companyName);
        // System.out.println(name); ❌ ERROR (non-static cannot be accessed directly)
    }
}

public class EmpStaticDemo {
    public static void main(String[] args) {
        // Accessing static variable and static method using class name
        System.out.println("Accessing static members directly using class name:");
        System.out.println("Company: " + Employee.companyName);
        Employee.displayCompany();
        System.out.println("============================");

        // Creating employee objects
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Neha";

        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "Rahul";

        // Calling non-static method using object
        System.out.println("Employee Details:");
        e1.displayEmployee();
        e2.displayEmployee();

        // Changing static variable (affects all objects)
        Employee.companyName = "CodeWave";

        System.out.println("After changing company name:");
        e1.displayEmployee();
        e2.displayEmployee();

        // Again calling static method using class name
        System.out.println("Accessing static method again:");
        Employee.displayCompany();
    }
}

