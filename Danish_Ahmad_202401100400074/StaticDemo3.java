public class StaticDemo3 {
        int value = 10;  //instance variable
    
        public static void main(String[] args) {
            StaticDemo3 obj = new StaticDemo3();
            System.out.println(obj.value); // ✅ OK
        }
    }

