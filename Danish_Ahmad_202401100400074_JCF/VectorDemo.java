import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector to store book titles
        Vector<String> books = new Vector<>();

        // 1. addElement() – Add books
        books.addElement("Java Programming");
        books.addElement("Python Basics");
        books.addElement("Data Structures");

        // 2. elementAt(index) – Get book at index
        System.out.println("Book at index 1: " + books.elementAt(1));

        // 3. insertElementAt() – Insert book at specific position
        books.insertElementAt("C++ Fundamentals", 1);
        System.out.println("After insertion: " + books);

        // 4. firstElement() – Get first book
        System.out.println("First book: " + books.firstElement());

        // 5. lastElement() – Get last book
        System.out.println("Last book: " + books.lastElement());

        // 6. removeElement() – Remove a specific book
        books.removeElement("Python Basics");
        System.out.println("After removing 'Python Basics': " + books);

        // 7. removeElementAt(index) – Remove book by index
        books.removeElementAt(0);
        System.out.println("After removing book at index 0: " + books);

        // 8. setElementAt() – Update book title
        books.setElementAt("Advanced Java", 0);
        System.out.println("After updating book at index 0: " + books);

        // 9. hasNext() – Use Iterator to list all books
        System.out.println("Books using Iterator:");
        Iterator<String> bookIterator = books.iterator();

        while (bookIterator.hasNext()) {
            System.out.println("- " + bookIterator.next());
        }

        // 10. removeAllElements() – Clear all books
        books.removeAllElements();
        System.out.println("After removing all books: " + books);
    }
}
