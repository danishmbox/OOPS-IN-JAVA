class Student {
    // 1. Instance Variable → belongs to object
    int rollNo;        
    String name;

    // 2. Static Variable → belongs to class
    static String school = "ABC School";  

    // Constructor → initializes instance variables
    Student(int r, String n) {
        rollNo = r;   // instance variable initialized using local variable r
        name = n;     // instance variable initialized using local variable n
    }

    void displayDetails() {
        // 3. Local Variable → inside method, temporary
        int marks = 90;  

        // Access all variables
        System.out.println("Roll No: " + rollNo);   // instance
        System.out.println("Name: " + name);        // instance
        System.out.println("School: " + school);    // static
        System.out.println("Marks: " + marks);      // local
    }

    public static void main(String[] args) {
        // Create two students (instance variables are different for each object)
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Neha");

        // Call display method
        s1.displayDetails();
        System.out.println("----------------");
        s2.displayDetails();
    }
}
