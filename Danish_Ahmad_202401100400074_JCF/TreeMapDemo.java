import java.util.*;
public class TreeMapDemo{
    public static void main(String args[]){
        //create
        TreeMap<String,Integer> hm=new TreeMap< >();
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
    }
}