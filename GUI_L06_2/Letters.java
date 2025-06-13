package GUI_L06_2;

import java.util.ArrayList;
import java.util.List;

public class Letters extends Thread {

    private static List<Letters> allInstances = new ArrayList<>();
    private char letter;

    public Letters(String s) {
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            Letters letterThread = new Letters(c);
            letterThread.setName("Thread " + c);
            allInstances.add(letterThread);
        }
    }

    private Letters(char c) {
        this.letter = c;
    }

    public static List<Thread> getThreads() {
        return new ArrayList<>(allInstances);
    }

    public static void stopAll() {
        for (Letters t : allInstances) {
            t.interrupt();
        }
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.print(letter);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
