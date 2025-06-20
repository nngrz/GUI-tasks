package GUI_L08_3;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class CalculatorWindow extends JFrame {
    
    private JTextField display;
    private final Color ORANGE_YELLOW = new Color(255, 214, 102);
    private final Color LIGHT_YELLOW = new Color(255, 255, 179);

    public CalculatorWindow() {

        setTitle("Calculator");
        setSize(380, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(ORANGE_YELLOW);
        setLayout(new BorderLayout(10, 10));
        setVisible(true);

        // Main oanel with padding
        JPanel maiPanel = new JPanel(new BorderLayout(10, 10));
        maiPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        maiPanel.setOpaque(false);
        add(maiPanel);

        // Display
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(LIGHT_YELLOW);
        display.setBorder(new CompoundBorder(
            new LineBorder(new Color(150, 150, 150), 2),
            new EmptyBorder(5, 10, 5, 10)
        ));
        maiPanel.add(display, BorderLayout.NORTH);

        // Number system selection
        JPanel systemPanel = new JPanel();
        systemPanel.setOpaque(false);
        systemPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.BLACK, 1),
            "system liczbowy",
            TitledBorder.CENTER,
            TitledBorder.TOP,
            new Font("Arial", Font.PLAIN, 14)
        ));
        systemPanel.setPreferredSize(new Dimension(
            display.getPreferredSize().width,
            display.getPreferredSize().height
        ));

        ButtonGroup systemGroup = new ButtonGroup();

        JRadioButton hexButton = new JRadioButton("Hexadecimal");
        JRadioButton decButton = new JRadioButton("Decimal", true);
        JRadioButton binButton = new JRadioButton("binary");

        systemGroup.add(hexButton);
        systemGroup.add(decButton);
        systemGroup.add(binButton);

        systemPanel.add(hexButton);
        systemPanel.add(decButton);
        systemPanel.add(binButton);

        maiPanel.add(systemPanel, BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        buttonPanel.setOpaque(false);
        String[] buttons = {
            "0", "1", "2", "3",
            "4", "5", "6", "7",
            "8", "9", "A", "B",
            "C", "D", "E", "F",
            "CE", "-", "+", "=",
        };

        for (String text : buttons) {
            JButton button = createCalculatorButton(text);
            buttonPanel.add(button);
        }

        maiPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    private JButton createCalculatorButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBorder(new CompoundBorder(
            new LineBorder(Color.GRAY, 2),
            new EmptyBorder(5, 0, 5, 0)
        ));
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setBackground(new Color(240, 240, 240, 240));

        if (text.equals("CE") || text.equals("+") || text.equals("-") || text.equals("=")) {
            button.setForeground(Color.RED);
        } else {
            button.setForeground(Color.BLACK);
        }

        return button;
    }
}
