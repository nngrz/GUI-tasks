package GUI_L06_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Letters letters = new Letters("ABCD");

        for (Thread t : Letters.getThreads()) {
            System.out.println(t.getName());
        }

        /* <- all threads should be started here */
        for (Thread t : Letters.getThreads()) {
            t.start();
        }

        Thread.sleep(5000);

        /* <- all threads should be interrupted here */
        Letters.stopAll();

        System.out.println("\nThe program has finished") ;
    }
}
