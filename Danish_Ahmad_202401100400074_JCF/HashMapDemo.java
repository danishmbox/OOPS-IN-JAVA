import java.util.*;
public class HashMapDemo{
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        int population=hm.get("India");
        System.out.println(population);

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.size());
         System.out.println(hm.isEmpty());
         hm.clear();

         for(int i=0;i<hm.size();i++){
            System.out.println(i+" "+hm.get(i));
         }
    }
}