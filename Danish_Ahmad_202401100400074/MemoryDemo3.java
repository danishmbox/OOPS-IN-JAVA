class Student {
    int rollNo;       // instance variable → stored in Heap (inside object)
    String name;      // instance variable → stored in Heap

    void display() {
        int marks = 95;  // local variable → stored in Stack (method frame)
        System.out.println("Roll: " + rollNo + ", Marks: " + marks);
    }
}

public class MemoryDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student(); // object created in Heap
        s1.rollNo = 101;
        s1.display();               // stack frame created for display()
    }
}

