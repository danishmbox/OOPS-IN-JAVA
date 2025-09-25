public class StaticContextDemo {
    int rollNo = 101;         // non-static (object-level)
    static String school = "ABC School"; // static (class-level)

    public static void main(String[] args) {
        // System.out.println(rollNo); // ❌ error: needs an object
        System.out.println(school);    // ✅ allowed, static

        StaticContextDemo s1 = new StaticContextDemo();
        System.out.println(s1.rollNo); // ✅ now works with object
    }
}

