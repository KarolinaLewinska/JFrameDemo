package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class FlowLayoutDemo {
    JFrame frame = new JFrame("Flow layout demo");
    JPanel panel = new JPanel();
    JButton btn = new JButton("FIRST");
    JButton btn2 = new JButton("SECOND");
    JButton btn3 = new JButton("THIRD");

    public FlowLayoutDemo() {
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,5 ));
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FlowLayoutDemo::new);
    }
}
