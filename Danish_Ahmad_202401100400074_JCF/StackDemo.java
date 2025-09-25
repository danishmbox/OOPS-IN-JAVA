import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // ===== Constructor: Create an empty stack =====
        Stack<String> returnedBooks = new Stack<>();

        // ===== 1. push() - Add books to stack =====
        returnedBooks.push("Java Programming");
        returnedBooks.push("Python Basics");
        returnedBooks.push("C++ Fundamentals");
        System.out.println("Returned Books Stack: " + returnedBooks);

        // ===== 2. peek() - Look at the top book =====
        System.out.println("Top book to shelve: " + returnedBooks.peek());

        // ===== 3. pop() - Remove the top book =====
        String shelvedBook = returnedBooks.pop();
        System.out.println("Shelved: " + shelvedBook);
        System.out.println("Remaining Stack: " + returnedBooks);

        // ===== 4. isEmpty() - Check if stack is empty =====
        System.out.println("Is stack empty? " + returnedBooks.isEmpty());

        // ===== 5. search(Object) - Find position from top (1-based) =====
        int position = returnedBooks.search("Java Programming");
        System.out.println("Position of 'Java Programming': " + position);

        // ===== 6. size() - Number of books in stack =====
        System.out.println("Total books in stack: " + returnedBooks.size());

        // ===== 7. clear() - Remove all books =====
        returnedBooks.clear();
        System.out.println("Stack after clearing: " + returnedBooks);
    }
}
