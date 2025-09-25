import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo {
    public static void main(String[] args) {

        // List is an interface → we use ArrayList implementation
        List<String> students = new ArrayList<>();

        System.out.println("----- Methods from Collection Interface -----");

        // add()
        students.add("Kavin");
        students.add("Rohit");
        students.add("Priya");
        System.out.println("Students: " + students);

        // addAll()
        List<String> newStudents = new ArrayList<>();
        newStudents.add("Amit");
        newStudents.add("Sanya");
        students.addAll(newStudents);
        System.out.println("After addAll: " + students);

        // contains()
        System.out.println("Contains Rahul? " + students.contains("Rahul"));

        // size()
        System.out.println("Total Students: " + students.size());

        // remove()
        students.remove("Priya");
        System.out.println("After remove Priya: " + students);

        // isEmpty()
        System.out.println("Is list empty? " + students.isEmpty());

        // iterator()
        System.out.print("Iterating with Iterator: ");
        Iterator<String> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //basic for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " ");
        }
        System.out.println();

        //for-each loop(enhanced for loop)
        for (String s : students) {
            System.out.print(s + " ");
        }

        // clear()
        // students.clear();
        // System.out.println("After clear: " + students);

        System.out.println("\n----- Methods from List Interface -----");

        // get()
        System.out.println("Student at index 1: " + students.get(1));

        // set()
        students.set(0, "Neha Thakur");
        System.out.println("After set: " + students);

        // indexOf()
        System.out.println("Index of Amit: " + students.indexOf("Amit"));

        // lastIndexOf()
        students.add("Rahul");
        System.out.println("List after adding Rahul again: " + students);
        System.out.println("Last index of Rahul: " + students.lastIndexOf("Rahul"));

        // subList()
        List<String> subList = students.subList(1, 3);
        System.out.println("Sublist (index 1 to 3): " + subList);
    }
}
