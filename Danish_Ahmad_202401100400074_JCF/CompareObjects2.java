import java.util.*;

public class CompareObjects2 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(11);
        arr.add(10);
        arr.add(17);
        arr.add(15);

        CompareObjects c1 = new CompareObjects();
        System.out.print("Original list: ");
        c1.display(arr);

        // Custom sort using Comparator
        Collections.sort(arr, new UnitDigitComparator());

        System.out.print("Sorted by unit digit: ");
        c1.display(arr);
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

// ✅ Custom Comparator class
class UnitDigitComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int unitA = a % 10;
        int unitB = b % 10;

        if (unitA != unitB) {
            return unitA - unitB; // sort by unit digit
        } else {
            return a - b; // if same, sort by actual value
        }
    }
}



