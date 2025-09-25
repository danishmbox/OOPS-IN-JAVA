public class StaticDemo1{
    static int x=10
   static void greet(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        int x=10;
        String message="Hii";
     //   StaticDemo1 d=new StaticDemo1();
   //    d.greet();

    greet();
    StaticDemo1.greet();
    }
}