public class AbstarctionDemo {
    public static void main(String args[]){
        Horse h=new Horse();
        h.walk();
        h.eats();

        Chicken c=new Chicken();
        c.walk();
    }
}

abstract class Animal{
    abstract void walk();

    void eats(){
        System.out.println("eats anything");
    }
}

class Horse extends Animal{
    void walk(){
        System.out.println("walk on four legs");
    }
}
class Chicken extends Animal{
     void walk(){
        System.out.println("walk on two legs");
    }
}

