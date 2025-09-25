import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Natural order: sort by ID
    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // ascending order by ID
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + age + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Rahul", 22));
        students.add(new Student(101, "Amit", 20));
        students.add(new Student(102, "Sneha", 23));

        System.out.println("Original list:");
        display(students);

        // Sort using Comparable
        Collections.sort(students);
        System.out.println("\nSorted by ID (Comparable):");
        display(students);
    }

    public static <T> void display(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

