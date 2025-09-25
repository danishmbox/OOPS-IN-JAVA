
class Employee {
    String name;
    int id;

    // Non-static inner class
    class Address {
        String city;
        String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        void displayAddress() {
            // Inner class can access outer class fields directly
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("City: " + city + ", State: " + state);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Rahul";
        emp1.id = 101;

        // To create inner class object → need outer class object
        Employee.Address addr1 = emp1.new Address("Delhi", "Delhi");

        addr1.displayAddress();
    }
}

