package GUI_L06_1;

public class SyncThread2 extends Thread {
    public static int value = 4000000;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            decrement();
        }
    }

    public synchronized static void decrement() {
        value--;
    }
}
