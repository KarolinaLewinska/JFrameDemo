package com.layouts;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

public class BoxLayoutDemo {
    JFrame frame = new JFrame("BoxLayout demo");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("First");
    JButton btn2 = new JButton("Second");

    public BoxLayoutDemo() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); //vertical align
        //panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)); //horizontal align
        panel.add(btn1);
        panel.add(btn2);
        panel.add(Box.createHorizontalGlue());
        //panel.add(Box.createVerticalGlue());
        panel.add(Box.createRigidArea(new Dimension(0,10))); //panel gap
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BoxLayoutDemo::new);
    }
}
