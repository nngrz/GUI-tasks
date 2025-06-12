package GUI_L06_1;

public class SyncThread1 extends Thread {
    public static int value = 4000000;
    public static String monitor = new String();

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (monitor) {
                value--;
            }
        }
    }
}
