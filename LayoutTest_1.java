import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class LayoutTest_1 extends JFrame {
    public LayoutTest_1() {
        JButton button1 = new JButton("Apple");
        JButton button2 = new JButton("Bicycle");
        JButton button3 = new JButton("Elephant");
        JButton button4 = new JButton("Sunshine");
        JButton button5 = new JButton("Mountain");

        JTextField textField1 = new JTextField("Enter text");
        JTextField textField2 = new JTextField("Enter new text");
        button5.setEnabled(false);
        button1.setEnabled(false);
        setLayout(new GridLayout(0, 3));
        add(button5);
        add(textField2);
        add(button3);
        add(button2);
        add(button4);
        button5.setEnabled(false);
        button5.setEnabled(false);
        button2.setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutTest_1();
    }
}
