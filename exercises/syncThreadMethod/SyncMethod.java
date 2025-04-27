package exercises.syncThreadMethod;

public class SyncMethod extends Thread{
    public static int value = 4000000;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            decrement();
        }
    }

    public synchronized static void decrement() {
        value--; // Monitor = class object (for static methods)
    }
}
