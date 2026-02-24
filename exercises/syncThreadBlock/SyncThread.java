package exercises.syncThreadBlock;

public class SyncThread extends Thread {
    public static Integer value = 4000000;
    public static String monitor = new String();

    @Override
    public void run() {
        for(int i = 0; i < 1000000; i++) {
            synchronized (monitor) {
                value--;
            }
        }
    }
}
