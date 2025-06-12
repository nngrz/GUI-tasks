package GUI_L06_1;

public class NonSyncThread extends Thread{
    public static int value = 4000000;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++)
            value--;
    }
 }
