package GUI_L08_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    
    private JTextField textA;
    private JTextField textB;
    private JButton addtionButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;

    public CalculatorFrame() {

        // Create components
        JLabel labelA = new JLabel("a:");
        textA = new JTextField("0");
        textA.setPreferredSize(new Dimension(100, 20));
        JLabel labelB = new JLabel("b:");
        textB = new JTextField("0");
        textB.setPreferredSize(new Dimension(100, 20));
        
        addtionButton = new JButton("a + b");
        addtionButton.setPreferredSize(new Dimension(150,30));
        subtractionButton = new JButton("a - b");
        subtractionButton.setPreferredSize(new Dimension(150,30));
        multiplicationButton = new JButton("a * b");
        multiplicationButton.setPreferredSize(new Dimension(150,30));
        divisionButton = new JButton("a / b");
        divisionButton.setPreferredSize(new Dimension(150,30));

        // Add action listener to the bottons
        // addition button
        addtionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addition();
            }
        });

        // substraction button
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtraction();
            }
        });

        // multiplication button
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplication();
            }
        });

        // division button
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                division();
            }
        });

        // Add components
        add(labelA);
        add(textA);
        add(labelB);
        add(textB);
        add(addtionButton);
        add(subtractionButton);
        add(multiplicationButton);
        add(divisionButton);

        setTitle("Calculator");
        setLayout(new FlowLayout());
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // method of addition
    private void addition() {
        try {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int sum = a + b;
            addtionButton.setText("a + b = " + sum);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                "Please enter valid intergers in both fields",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
            addtionButton.setText("a + b (Error)");
        }
    }

    // method of subtraction
    private void subtraction() {
        try {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int subtraction = a - b;
            subtractionButton.setText("a - b = " + subtraction);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                "Please enter valid intergers in both fields",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
            subtractionButton.setText("a - b (Error)");
        }
    }

    // method of multiplication
    private void multiplication() {
        try {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int multiplication = a * b;
            multiplicationButton.setText("a * b = " + multiplication);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                "Please enter valid intergers in both fields",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
            multiplicationButton.setText("a * b (Error)");
        }
    }

    // method of division
    private void division() {
        try {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int division = a / b;
            divisionButton.setText("a / b = " + division);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                "Please enter valid intergers in both fields",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
            divisionButton.setText("a / b (Error)");
        }
    }
}
