import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // Create an ArrayList to store book titles
        ArrayList<String> books = new ArrayList<>();

        // ===== 1. add() - Add book to the list =====
        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");

        // Print current list
        System.out.println("Books in library: " + books);

        // ===== 2. add(index, element) - Insert book at specific index =====
        books.add(1, "C++ Fundamentals");
        System.out.println("After inserting at index 1: " + books);

        // ===== 3. get(index) - Access book at index =====
        System.out.println("Book at index 2: " + books.get(2));

        // ===== 4. set(index, element) - Update book at index =====
        books.set(0, "Advanced Java");
        System.out.println("After updating index 0: " + books);

        // ===== 5. remove(index) - Remove by index =====
        books.remove(2);
        System.out.println("After removing book at index 2: " + books);

        // ===== 6. remove(Object) - Remove by name =====
        books.remove("C++ Fundamentals");
        System.out.println("After removing 'C++ Fundamentals': " + books);

        // ===== 7. contains(element) - Check if a book exists =====
        System.out.println("Does library contain 'Python Basics'? " + books.contains("Python Basics"));

        // ===== 8. indexOf(element) - Find index of a book =====
        System.out.println("Index of 'Python Basics': " + books.indexOf("Python Basics"));

        // ===== 9. isEmpty() - Check if list is empty =====
        System.out.println("Is library empty? " + books.isEmpty());

        // ===== 10. size() - Total number of books =====
        System.out.println("Total books in library: " + books.size());

        // ===== 11. clear() - Remove all books =====
       -/
    }
}
