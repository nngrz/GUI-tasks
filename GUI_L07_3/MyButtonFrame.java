package GUI_L07_3;

import javax.swing.*;
import java.awt.*;

public class MyButtonFrame extends JFrame  {
    private JPanel buttonPanel;
    private JButton[] buttons;
    private String[] buttonLabels = {"Button1", "Button 2", "B3", "B 4", "Big button with a number 5"};

    public MyButtonFrame() {

        // Create buttons
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
        }

        // Create the panel to hold the buttons
        buttonPanel = new JPanel();
        add(buttonPanel); // Initially add with default FlowLayout

        // Show layout selection dialog and apply the chosen layout
        String selectedLayout = showLayoutSelectionDialog();
        applyLayout(selectedLayout);

        setTitle("Button Frame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String showLayoutSelectionDialog() {
        Object[] options = {
            "BorderLayout",
            "FlowLayout Left",
            "FlowLayout Right",
            "FlowLayout Center",
            "GridLayout Row",
            "GridLayout Column",
            "GridLayout Table"
        };

        String selected = (String) JOptionPane.showInputDialog(
            this,
            "Choose a Layout manager:",
            "Layout Selection",
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
        );

        // Return default if user cancels
        return selected != null ? selected : "FlowLayout Center";
    }

    private void applyLayout(String layoutType) {
        buttonPanel.removeAll();
        buttonPanel.revalidate();
        buttonPanel.repaint();

        switch (layoutType) {
            case "BorderLayout":
                buttonPanel.setLayout(new BorderLayout());
                buttonPanel.add(buttons[0], BorderLayout.NORTH);
                buttonPanel.add(buttons[1], BorderLayout.SOUTH);
                buttonPanel.add(buttons[2], BorderLayout.WEST);
                buttonPanel.add(buttons[3], BorderLayout.EAST);
                buttonPanel.add(buttons[4], BorderLayout.CENTER);
                break;

            case "FlowLayout Left":
                buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                addAllButtons();
                break;

            case "FlowLayout Right":
                buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
                addAllButtons();
                break;

            case "FlowLayout Center":
                buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                addAllButtons();
                break;

            case "GridLayout Row":
                buttonPanel.setLayout(new GridLayout(1, buttons.length));
                addAllButtons();
                break;

            case "GridLayout Column":
                buttonPanel.setLayout(new GridLayout(buttons.length, 1));
                addAllButtons();
                break;

            case "GridLayout Table":
                buttonPanel.setLayout(new GridLayout(3, 2));
                addAllButtons();
                // Add empty label to fill the grid
                buttonPanel.add(new JLabel(""));
                break;

            default:
                // Default to FlowLayout Center if unknown layout
                buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                addAllButtons();
                break;
        }
    }

    private void addAllButtons() {
        for (JButton button : buttons) {
            buttonPanel.add(button);
        }
    }
}
