package GUI_L07_1;

import javax.swing.JFrame;

public class DiagonalWindow extends JFrame {
    public DiagonalWindow() {
        // Create a custom JPanel to handle the drawing
        DrawingPanel drawingPanel = new DrawingPanel();
        // Add the panel to the Jframe
        add(drawingPanel);

        setTitle("Diagonal Window");
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
