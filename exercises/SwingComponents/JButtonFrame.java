package exercises.SwingComponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JButtonFrame extends JFrame {
    public JButtonFrame() {
        try {
            // Force Metal look-and-feel which respects colors better
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JButton button = new JButton("Click me!");     
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Clicked");

                if(button.getBackground() == Color.GREEN)
                    button.setBackground(Color.ORANGE);
                else
                    button.setBackground(Color.GREEN);
            }
        });

        button.setToolTipText("Button");
        
        add(button);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
