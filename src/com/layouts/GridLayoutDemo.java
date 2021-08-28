package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class GridLayoutDemo {
    JFrame frame = new JFrame("GridLayout demo");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("First");
    JButton btn2 = new JButton("Second");
    JButton btn3 = new JButton("Third");
    JButton btn4 = new JButton("Fourth");

    public GridLayoutDemo() {
        panel.setLayout(new GridLayout(2,2,3,4));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        //Changing size of one button resize also the rest of buttons
        //btn1.setPreferredSize(new Dimension(100,100));
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        //frame.setSize(200,200);
        frame.setVisible(true);
    }
    public static void main (String [] args) {
        SwingUtilities.invokeLater(GridLayoutDemo::new);
    }
}

