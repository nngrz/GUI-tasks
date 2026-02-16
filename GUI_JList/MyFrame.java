package GUI_JList;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class MyFrame extends JFrame {

    private JList<String> list;
    private JTextField textField;
    private JButton button1;
    private JButton button2;

    private MyListModel model;

    public MyFrame(LinkedList<String> data) {

        // Window setup
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Model
        model = new MyListModel(data);

        // View
        list = new JList<>(model);
        textField = new JTextField();
        button1 = new JButton("Action 1");
        button2 = new JButton("Action 2");

        // Layout
        setLayout(new BorderLayout());

        add(new JScrollPane(list), BorderLayout.CENTER);
        add(textField, BorderLayout.NORTH);

        JPanel buttomPanel = new JPanel();
        buttomPanel.add(button1);
        buttomPanel.add(button2);
        add(buttomPanel, BorderLayout.SOUTH);

        // Controller
        button1.addActionListener(e -> {
            try {
                JOptionPane.showMessageDialog(
                    this,
                    "Size: " + model.getSize(),
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}
