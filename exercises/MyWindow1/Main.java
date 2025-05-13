package exercises.MyWindow1;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // new MyWindow1();

        // SwingUtilities.invokeLater(new Runnable() {
        //     @Override
        //     public void run() {
        //         new MyWindow1();
        //     }
        // });
        
        /*
        // Protection against deadlocks of threats and against
        // incorrect displaying of the window content when this window is changed.
        // Thanks to this we have the ability to edit components while our app is running
        */
        // SwingUtilities.invokeLater(() -> new MyWindow1());
        // SwingUtilities.invokeLater(() -> new MyWindow2());
        SwingUtilities.invokeLater(() -> new MyWindow3());
    }
}
