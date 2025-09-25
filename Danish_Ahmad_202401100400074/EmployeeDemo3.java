 class Employee {
    String name;
    int id;
    double salary;

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Method to increase salary
    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary updated! New salary: " + salary);
    }
}

public class EmployeeDemo3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Bob";
        emp1.id = 102;
        emp1.salary = 60000;

        emp1.displayInfo();
        emp1.increaseSalary(5000);
    }
}