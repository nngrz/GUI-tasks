package GUI_L07_1;

import javax.swing.*;
import java.awt.*;


public class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Set the color for the lines
        g.setColor(Color.BLUE);
        // Draw the first diagonal (top-left to bottom-right)
        g.drawLine(0,0, width, height);
        // Draw the second diagonal (top-right to bottom-left)
        g.drawLine(width, 0, 0, height);
    }
}
