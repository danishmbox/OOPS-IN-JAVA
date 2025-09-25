class Employee {
    private double salary;   // private
    String name;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Static nested class
    static class BonusCalculator {
        double calculateBonus(Employee emp) {
            // Need outer object to access private member
            return emp.salary * 0.10;
        }
    }
}

public class NestedStaticDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 60000);

        Employee.BonusCalculator calc = new Employee.BonusCalculator();
        System.out.println("Bonus for " + emp.name + " is: " + calc.calculateBonus(emp));
    }
}

