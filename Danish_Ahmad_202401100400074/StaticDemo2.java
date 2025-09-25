public class StaticDemo2 {
 static  int value = 10;

    public static void main(String[] args) {
       // int value=10;
       System.out.println(StaticDemo2.value); // ❌ Compile-time error

       // StaticDemo2 val=new StaticDemo2();
       // System.out.println(val.value);
    }
}

