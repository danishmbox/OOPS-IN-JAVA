public class InheritanceDemo {
    public static void main(String args[]){
        Fish f=new Fish();
        f.breathe();
        f.swim();
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
