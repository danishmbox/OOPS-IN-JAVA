public class InheritanceDemo4 {
    public static void main(String args[]){
        Bird parrot=new Bird();
        parrot.eats();
        parrot.fly();
        

    }
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
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
