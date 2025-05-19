package GUI_L07_2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextWindow window = new TextWindow();
            window.setTextAreaProperties(Color.YELLOW, Color.BLUE, "Dialog", 14, Font.BOLD);
        });
    }
}
