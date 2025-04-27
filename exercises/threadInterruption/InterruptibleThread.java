package exercises.threadInterruption;

public class InterruptibleThread extends Thread {
    public int value = 1;
    
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            value++;
        }
    }
}
