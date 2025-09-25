class Employee {
    // Private fields (hidden from outside)
    private String name;
    private int id;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID!");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }
}


public class GetterSetterDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("Rahul");
        emp.setId(101);
        emp.setSalary(50000);

        // Trying invalid data
        emp.setSalary(-2000); // Rejected
        emp.setName(""); // Rejected

        // Getting values using getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: ₹" + emp.getSalary());
    }
}
