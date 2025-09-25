public class InheritanceDemo2 {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
    }
}

class Animal{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
    }

    class Fish extends Animal{
        void swim(){
            System.out.println("swims");
        }
    }