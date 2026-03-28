import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class LayoutTest_2 extends JFrame {
    public LayoutTest_2() {
        JButton button1 = new JButton("Apple");
        JButton button2 = new JButton("Bicycle");
        JButton button3 = new JButton("Elephant");
        JButton button4 = new JButton("Sunshine");
        JButton button5 = new JButton("Mountain");

        JTextField textField1 = new JTextField("Enter text");
        JTextField textField2 = new JTextField("Enter new text");
        button1.setEnabled(false);
        button5.setEnabled(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(button5);
        add(textField2);
        add(button4);
        add(button4);
        add(button1);
        button2.setEnabled(true);
        button3.setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutTest_2();
    }
}
