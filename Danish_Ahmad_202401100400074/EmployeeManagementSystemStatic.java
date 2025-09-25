
class Employee {
    String name;
    int id;

    // Static nested class
    static class Company {
        String companyName;
        String location;

        Company(String companyName, String location) {
            this.companyName = companyName;
            this.location = location;
        }

        void displayCompany() {
            System.out.println("Company: " + companyName);
            System.out.println("Location: " + location);
            // Cannot directly access outer class instance variables (name, id)
            // Because this class is static
        }
    }
}

public class EmployeeManagementSystemStatic {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Neha";
        emp1.id = 102;

        // Can create static nested class object without outer class object
        Employee.Company comp = new Employee.Company("TechSoft", "Bangalore");

        comp.displayCompany();
    }
}

