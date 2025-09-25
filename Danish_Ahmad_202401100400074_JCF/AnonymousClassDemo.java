public class AnonymousClassDemo {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running inside an anonymous class");
            }
        };
        task.run();
    }
}
