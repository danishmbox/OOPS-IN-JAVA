class Employee {
    String name;
    int id;
    double salary;

    // Default constructor (automatically created if not defined, but here we define it explicitly)
    public Employee() {
        // No initialization here — just showing it's called
        System.out.println("Default constructor called!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-----------------------");
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        
        // Create object using default constructor
        Employee e1 = new Employee(); // Calls default constructor
        e1.displayInfo(); // Displays default values (null, 0, 0.0)
    }
}

