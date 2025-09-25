import java.util.LinkedList;
import java.util.List;

public class LinkedListConstructorDemo {
    public static void main(String[] args) {

        // 1️⃣ Using Default Constructor — To manage books currently issued
        LinkedList<String> issuedBooks = new LinkedList<>();
        issuedBooks.add("Java Programming");
        issuedBooks.add("Data Structures");
        issuedBooks.add("Database Systems");

        System.out.println("Books currently issued:");
        for (String book : issuedBooks) {
            System.out.println("- " + book);
        }

        // 2️⃣ Using Constructor with Another Collection — To create a reading list from a predefined list
        List<String> readingListTemplate = List.of("Operating Systems", "Computer Networks", "AI Fundamentals");
        LinkedList<String> readingList = new LinkedList<>(readingListTemplate);

        System.out.println("\nRecommended reading list for students:");
        for (String book : readingList) {
            System.out.println("- " + book);
        }
    }
}
