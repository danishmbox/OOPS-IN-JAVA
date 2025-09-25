 class Employee {
    // Private: accessible only inside Employee class
    private double salary;

    // Default (no modifier): accessible in same package only
    String department;

    // Protected: accessible in same package + subclasses in other packages
    protected String name;

    // Public: accessible from anywhere
    public int id;

    // Public method to set salary (because salary is private)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method: accessible anywhere
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department);
    }

    // Private method: only inside Employee
    private void showSalary() {
        System.out.println("Salary: ₹" + salary);
    }

    // Public method that internally calls the private method
    public void displayFullDetails() {
        displayInfo();
        showSalary(); // allowed inside same class
    }

    // Protected method: can be called from same package
    protected void increaseSalary(double amount) {
        salary += amount;
        System.out.println("New Salary: ₹" + salary);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        // Create employee object
        Employee emp1 = new Employee();

        // Assign values to public, protected, and default fields directly
        emp1.id = 101;             // public
        emp1.name = "Alice";       // protected (accessible in same package)
        emp1.department = "IT";    // default (same package)

        // Set private field via public method
        emp1.setSalary(60000);

        // Public method
        emp1.displayInfo();

        // Public method that calls private method internally
        emp1.displayFullDetails();

        // Protected method (same package) - accessible
        emp1.increaseSalary(3000);
    }
}




