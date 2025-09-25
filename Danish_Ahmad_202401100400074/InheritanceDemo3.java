public class InheritanceDemo3 {
    
}
class Animal{
    String colour;

    void eats(){
        System.out.println("eats");
    }

   protected void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
      int legs;
}
