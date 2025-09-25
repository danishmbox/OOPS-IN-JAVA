import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int element=list.get(2);
         System.out.println(element);

         list.remove(2); //to remove element at ith index
          System.out.println(list);

          list.set(2,10);  //index,value
           System.out.println(list);

          System.out.println(list.contains(1));

          list.add(1,9);
           System.out.println(list);
            System.out.println(list.size());

            Collections.sort(list);
            System.out.println(list);

    }
}