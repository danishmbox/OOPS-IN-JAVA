import java.util.LinkedList;
public class LinkedListJCF{
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll =new LinkedList<>();
        //add
        ll.addLast(122222222);
        ll.addLast(2000000000);
        ll.addFirst(0111111111);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}