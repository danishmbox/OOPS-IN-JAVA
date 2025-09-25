import java.util.*;

// Student class (no Comparable here)
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + age + ")";
    }
}

// Separate Comparator class for Age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;  // ascending order by age
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Rahul", 22));
        students.add(new Student(101, "Amit", 20));
        students.add(new Student(102, "Sneha", 23));

        System.out.println("Original list:");
        display(students);

        // Sort using external Comparator (AgeComparator)
        Collections.sort(students, new AgeComparator());

        System.out.println("\nSorted by Age (Comparator class):");
        display(students);
    }

    public static <T> void display(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

