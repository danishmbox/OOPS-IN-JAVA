import java.util.*;
public class CompareObjects{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
          arr.add(10);
          arr.add(20);
          arr.add(11);
          arr.add(10);
          arr.add(17);
          arr.add(15);
          CompareObjects c1=new CompareObjects();
          c1.display(arr);

          Collections.sort(arr);  //method present in Collection framework
          c1.display(arr);

          Collections.sort(arr, Collections.reverseOrder());
          c1.display(arr);
    }

    public<T> void display(ArrayList<T> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}