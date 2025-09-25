public class MemoryDemo {
    static int schoolCode = 101; // goes to Method Area
    int rollNo;                  // goes to Heap with object

    static void showSchool() {   // code goes to Method Area
        System.out.println(schoolCode);
    }

    void showRoll() {            // code in Method Area, but needs object
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        showSchool();            // static method called → stack frame created
        MemoryDemo m1 = new MemoryDemo(); 
        m1.rollNo = 12;
        m1.showRoll();           // object method call → stack frame created
    }
}

