
class Employee {
    // Attributes
    String name;
    int id;
    double salary;
    String department;
    String designation;
    int leaveBalance;

    // Method to display employee info
    public void displayInfo() {
        System.out.println("===== Employee Details =====");
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary     : " + salary);
        System.out.println("Leave Bal. : " + leaveBalance + " days");
        System.out.println("============================\n");
    }

    // Method to increase salary (fixed amount)
    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println(name + "'s salary increased by ₹" + amount + ". New salary: ₹" + salary);
    }

    // Method to increase salary by percentage
    public void increaseSalary(double percentage, boolean isPercentage) {
        if (isPercentage) {
            salary += salary * (percentage / 100);
            System.out.println(name + "'s salary increased by " + percentage + "%. New salary: ₹" + salary);
        }
    }

    // Method to calculate annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }

    // Method to apply leave
    public void applyLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
            System.out.println(days + " days leave approved for " + name + ". Remaining leave: " + leaveBalance);
        } else {
            System.out.println("Leave request denied for " + name + ". Not enough leave balance.");
        }
    }

    // Method to add bonus
    public void addBonus(double bonusAmount) {
        salary += bonusAmount;
        System.out.println("Bonus of ₹" + bonusAmount + " added for " + name + ". New salary: ₹" + salary);
    }

    // Method to deduct tax
    public void deductTax(double taxPercentage) {
        double taxAmount = salary * (taxPercentage / 100);
        salary -= taxAmount;
        System.out.println("Tax of " + taxPercentage + "% deducted (" + taxAmount + "). New salary: ₹" + salary);
    }

    // Promote employee
    public void promote(String newDesignation, double hikePercentage) {
        designation = newDesignation;
        increaseSalary(hikePercentage, true);
        System.out.println(name + " promoted to " + designation);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating an Employee
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.department = "IT";
        emp1.designation = "Software Engineer";
        emp1.leaveBalance = 15;

        // Display info
        emp1.displayInfo();

        // Salary increment
        emp1.increaseSalary(5000);
        emp1.increaseSalary(10, true);

        // Annual salary
        System.out.println("Annual Salary: ₹" + emp1.getAnnualSalary() + "\n");

        // Bonus
        emp1.addBonus(8000);

        // Tax deduction
        emp1.deductTax(10);

        // Leave management
        emp1.applyLeave(5);
        emp1.applyLeave(20);

        // Promotion
        emp1.promote("Senior Software Engineer", 15);

        emp1.displayInfo();
    }
}
