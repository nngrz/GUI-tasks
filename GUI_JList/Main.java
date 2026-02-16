package GUI_JList;

import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> data = new LinkedList<>();
        data.add("One");
        data.add("Two");
        data.add("Three");

        SwingUtilities.invokeLater(() -> {
            new MyFrame(data);
        });
    }
}
