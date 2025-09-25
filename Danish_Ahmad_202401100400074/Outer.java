public class Outer {

    class Inner {
        void greet() {
            System.out.println("Hello from Inner class!");
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();                  // Create Outer class object
        Outer.Inner innerObj = outerObj.new Inner();   // Create Inner class object
        innerObj.greet();
        

        
    }
}
