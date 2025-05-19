package GUI_L07_2;

import java.awt.*;
import javax.swing.*;

public class TextWindow extends JFrame {
    
    private JTextArea textArea;

    public TextWindow() {
        
        // Create the JTextArea
        textArea = new JTextArea();
        textArea.setFont(new Font("Dialog", Font.PLAIN, 12));
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);

        // Add the JTextArea to a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        setTitle("Text Window");
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setTextAreaProperties(Color backgroundColor, Color fontColor, String fontType, int fontSize, int fontEmphasis) {
        textArea.setBackground(backgroundColor);
        textArea.setForeground(fontColor);
        Font font = new Font(fontType, fontEmphasis, fontSize);
        textArea.setFont(font);
    }
}
