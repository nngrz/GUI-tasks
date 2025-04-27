package exercises.threadInterruption;

public class Main {
    public static void main(String[] args) throws Exception{
        InterruptibleThread t = new InterruptibleThread();
        t.start();

        Thread.sleep(5000);
        t.interrupt();

        System.out.println(t.value);
    }
}
