package exercises.MyWindow1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow3 extends JFrame {
    public MyWindow3() {

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        JButton b1 = new JButton("PageStart");
        JButton b2 = new JButton("PageEnd");
        JButton b3 = new JButton("LineStart");
        JButton b4 = new JButton("PageEnd");
        JButton b5 = new JButton("Center");

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("B5 clicked");
                b5.setText("Clicked");
            }

        });
        JPanel pageStartPanel = new JPanel();
        pageStartPanel.setLayout(new FlowLayout());
        pageStartPanel.add(b1);
        pageStartPanel.add(new JButton("aaa"));

        jPanel.add(pageStartPanel, BorderLayout.PAGE_START);
        jPanel.add(b2, BorderLayout.PAGE_END);
        jPanel.add(b3, BorderLayout.LINE_START);
        jPanel.add(b4, BorderLayout.LINE_END);
        jPanel.add(b5, BorderLayout.CENTER);

        add(jPanel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
