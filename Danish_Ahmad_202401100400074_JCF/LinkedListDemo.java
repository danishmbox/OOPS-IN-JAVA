import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList to store book titles
        LinkedList<String> books = new LinkedList<>();

        // ====== 1. add(), addFirst(), addLast() ======
        books.add("Java Programming");               // Adds to end
        books.addFirst("C++ Basics");                // Adds at beginning
        books.addLast("Python for Beginners");
        books.add("ABC"); 
        books.addLast("xxx");      // Adds at end
        System.out.println("Books: " + books);

        // ====== 2. get(), getFirst(), getLast() ======
        System.out.println("First Book: " + books.getFirst());
        System.out.println("Last Book: " + books.getLast());
        System.out.println("Book at index 1: " + books.get(1));

        // ====== 3. remove(), removeFirst(), removeLast() ======
        books.remove("C++ Basics");                  // Remove by name
        books.removeFirst();                         // Remove first book
        books.removeLast();                          // Remove last book
        System.out.println("Books after removal: " + books);

        // Add more for further examples
        books.add("Data Structures");
        books.add("Operating Systems");

        // ====== 4. contains() ======
        System.out.println("Is 'Java Programming' available? " + books.contains("Java Programming"));

        // ====== 5. set(index, element) ======
        books.set(0, "Advanced Java");               // Update book at index 0
        System.out.println("Updated books: " + books);

        // ====== 6. size() ======
        System.out.println("Total books: " + books.size());

        // ====== 7. clear() ======
        books.clear();                               // Remove all books
        System.out.println("After clearing: " + books);
    }
}
