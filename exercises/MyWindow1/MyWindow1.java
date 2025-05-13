package exercises.MyWindow1;

import javax.swing.*;
import java.awt.*;

public class MyWindow1 extends JFrame {
    public MyWindow1() {

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int w = getWidth() - 1;
                int h = getHeight() - 1;

                g.setColor(Color.BLUE);

                for (int i = 10; i < Math.min(w,h)/2; i += 10){
                    g.drawRect(i, i, w - i*2, h - i*2);
                }
            }

        };

        add(panel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
