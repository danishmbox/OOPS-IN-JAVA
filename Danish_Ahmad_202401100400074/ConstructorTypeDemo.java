class Employee {
    String name;
    int id;
    double salary;

    // Non-parameterized constructor (User-defined)
    public Employee() {
        System.out.println("Non-parameterized constructor called!");
        // No assignments here — default values from Java are used
    }

    // Parameterized constructor (3 parameters)
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Parameterized constructor (3 args) called!");
    }

    // Overloaded parameterized constructor (2 parameters)
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 30000.0; // Assigning default salary
        System.out.println("Overloaded constructor (2 args) called!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-----------------------");
    }
}

class ConstructorTypeDemo {
    public static void main(String[] args) {
        // Calling Non-parameterized constructor
        Employee e1 = new Employee();
        e1.displayInfo();

        // Calling Parameterized constructor (3 args)
        Employee e2 = new Employee("Alice", 101, 50000.0);
        e2.displayInfo();

        // Calling Overloaded constructor (2 args)
        Employee e3 = new Employee("Bob", 102);
        e3.displayInfo();
    }
}
