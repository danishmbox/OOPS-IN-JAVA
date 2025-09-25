 class Employee {
   private  double salary; // hidden from outside

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary must be positive.");
        }
    }

    public double getSalary() {
        return salary; // read-only access (outside can't change directly)
    }
}

public class PrivateModifierDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
       // emp.salary=-3000;
        emp.setSalary(50000); // ✅ Works
        emp.setSalary(-1000); // ❌ Rejected
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}

