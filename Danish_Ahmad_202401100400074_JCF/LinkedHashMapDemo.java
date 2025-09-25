import java.util.*;
public class LinkedHashMapDemo{
    public static void main(String args[]){
        //create
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        
    }
}