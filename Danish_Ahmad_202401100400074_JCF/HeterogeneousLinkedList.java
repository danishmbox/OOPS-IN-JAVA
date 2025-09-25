import java.util.LinkedList;

public class HeterogeneousLinkedList {
      @SuppressWarnings("unchecked")  // Suppresses unchecked warnings
       public static void main(String[] args) {
       LinkedList list = new LinkedList();  // No <Type> specified

        list.add("Book Title");           // String
        list.add(101);                    // Integer
        list.add(49.99);                  // Double
        list.add(true);                   // Boolean

        System.out.println("Heterogeneous LinkedList: " + list);
    }

}
