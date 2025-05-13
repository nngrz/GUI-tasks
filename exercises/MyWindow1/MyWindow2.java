package exercises.MyWindow1;

import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    public MyWindow2() {

        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jTextArea.setFont(new Font(Font.SERIF, Font.ITALIC | Font.BOLD, 30));
        jTextArea.setBackground(Color.YELLOW);
        jTextArea.setForeground(Color.RED);

        add(jScrollPane);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
