package GUI_L08_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class Sumator extends JFrame {

    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton sumButton;

    public Sumator() {
        // Create components
        JLabel labelA = new JLabel("a:");
        textFieldA = new JTextField("0");
        textFieldA.setPreferredSize(new Dimension(100, 20));

        JLabel labelB = new JLabel("b:");
        textFieldB = new JTextField("0");
        textFieldB.setPreferredSize(new Dimension(100, 20));

        sumButton = new JButton("a + b");
        sumButton.setPreferredSize(new Dimension(150, 30));

        // Add action listener to the button
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });

        add(labelA);
        add(textFieldA);
        add(labelB);
        add(textFieldB);
        add(sumButton);

        setTitle("Sumator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateSum() {
        try {
            int a = Integer.parseInt(textFieldA.getText());
            int b = Integer.parseInt(textFieldB.getText());
            int sum = a + b;
            sumButton.setText("a + b = " + sum);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                "Please enter valid intergers in both fields",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
            sumButton.setText("a + b (Error)");
        }
    }
}
