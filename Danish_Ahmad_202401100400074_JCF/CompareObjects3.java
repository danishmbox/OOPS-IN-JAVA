import java.util.*;
public class CompareObjects3 {
    public static void main(String args[]) {
        ArrayList<MyInteger> arr = new ArrayList<>();
        arr.add(new MyInteger(10));
        arr.add(new MyInteger(20));
        arr.add(new MyInteger(11));
        arr.add(new MyInteger(10));
        arr.add(new MyInteger(17));
        arr.add(new MyInteger(15));

        CompareObjects2 c1 = new CompareObjects2();
        System.out.print("Original list: ");
        c1.display(arr);

        // Sort using Comparable (no need to pass Comparator)
        Collections.sort(arr);

        System.out.print("Sorted by unit digit: ");
        c1.display(arr);
      //  ArrayList<Integer> arr1=new ArrayList<>();
    }

    // Generic display method
    public <T> void display(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

// ✅ Custom class implementing Comparable
class MyInteger implements Comparable<MyInteger> {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyInteger other) {
        int unitA = this.value % 10;
        int unitB = other.value % 10;

        if (unitA != unitB) {
            return unitA - unitB; // sort by unit digit
        } else {
            return this.value - other.value; // sort by actual value if unit digits are same
        }
    }

     @Override
     public String toString() {
        return String.valueOf(value);
     }
}
