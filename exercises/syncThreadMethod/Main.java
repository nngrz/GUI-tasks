package exercises.syncThreadMethod;

public class Main {
    public static void main(String[] args) {
        Thread syncThread1 = new SyncMethod();
        Thread syncThread2 = new SyncMethod();
        Thread syncThread3 = new SyncMethod();

        syncThread1.start();
        syncThread2.start();
        syncThread3.start();

        try {
            syncThread1.join();
            syncThread2.join();
            syncThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SyncMethod.value);
    }
}
