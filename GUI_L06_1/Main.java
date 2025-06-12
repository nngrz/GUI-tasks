package GUI_L06_1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public  void run() {
                System.out.println("Third thread");
            }
        });
        t2.start();

        Thread t3 = new Thread (() -> System.out.println("Fourth thread"));
        t3.start();

        try {
            t3.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("No synchronization");

        NonSyncThread nonSyncThread1 = new NonSyncThread();
        NonSyncThread nonSyncThread2 = new NonSyncThread();

        nonSyncThread1.start();
        nonSyncThread2.start();

        try {
            nonSyncThread1.join();
            nonSyncThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(NonSyncThread.value);

        System.out.println("Synchronization block");

        SyncThread1 syncThread1 = new SyncThread1();
        SyncThread1 syncThread2 = new SyncThread1();

        syncThread1.start();
        syncThread2.start();

        try {
            syncThread1.join();
            syncThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SyncThread1.value);

        // Synchronized method
        System.out.println("Synchronization method");

        SyncThread2 syncThread3 = new SyncThread2();
        SyncThread2 syncThread4 = new SyncThread2();

        syncThread3.start();
        syncThread4.start();

        try {
            syncThread3.join();
            syncThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SyncThread2.value);
    }
}
