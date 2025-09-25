class Employee {
    private double salary;   // private member
    String name;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Inner class
    class BonusCalculator {
        double calculateBonus() {
            // Directly accessing private member of outer class
            return salary * 0.10;  
        }

        void displayBonus() {
            System.out.println("Bonus for " + name + " is: " + calculateBonus());
        }
    }
}

public class NestedDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Neha", 50000);

        // Create inner class object through outer class object
        Employee.BonusCalculator calc = emp.new BonusCalculator();
        calc.displayBonus();
    }
}

