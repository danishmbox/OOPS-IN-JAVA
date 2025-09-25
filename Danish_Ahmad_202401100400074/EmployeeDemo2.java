// Public class - must match file name
public class EmployeeDemo2 {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.id = 101;
        emp.salary = 50000;
        emp.displayInfo();

        // Create Department object
        Department dept = new Department();
        dept.deptName = "IT";
        dept.location = "Block A";
        dept.showDepartment();
    }
}

// Another class (default access)
class Employee {
    String name;
    int id;
    double salary;

    void displayInfo() {
        System.out.println("Employee: " + name + " | ID: " + id + " | Salary: ₹" + salary);
    }
}

// Another class (default access)
class Department {
    String deptName;
    String location;

    void showDepartment() {
        System.out.println("Department: " + deptName + " | Location: " + location);
    }
}

