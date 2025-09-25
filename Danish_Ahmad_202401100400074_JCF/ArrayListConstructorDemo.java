import java.util.ArrayList;
import java.util.List;

public class  ArrayListConstructorDemo {
    public static void main(String[] args) {

        // 1️⃣ Using Default Constructor - For a small shelf of newly arrived books
        ArrayList<String> newArrivals = new ArrayList<>();
        newArrivals.add("Java Programming");
        newArrivals.add("Python for Beginners");
        System.out.println("New Arrivals (Default Constructor): " + newArrivals);

        // 2️⃣ Using Constructor with Initial Capacity - For reserving space for 100 books
        ArrayList<String> reservedShelf = new ArrayList<>(100);
        reservedShelf.add("Data Structures");
        reservedShelf.add("Algorithms");
        System.out.println("Reserved Shelf (Initial Capacity Constructor): " + reservedShelf);

        // 3️⃣ Using Constructor with Another Collection - Copying books from main library
        List<String> mainLibraryBooks = List.of("DBMS", "Computer Networks", "Operating Systems");
        ArrayList<String> departmentLibrary = new ArrayList<>(mainLibraryBooks);
        System.out.println("Department Library (From Collection Constructor): " + departmentLibrary);
    }
}
